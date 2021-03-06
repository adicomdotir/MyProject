package ir.javacup.reflection;

import java.util.*;
import java.lang.reflect.*;

public class Copier {
	private String[] fieldsName;

	public Copier(String... args) {
		fieldsName = args;
	}
	
	public void copy(Object o1, Object o2) {
		try {
			if (fieldsName.length == 0) {
				Field[] fields = o1.getClass().getDeclaredFields();
				fieldsName = new String[fields.length];
				for (int i = 0; i < fields.length; i++) {
					fieldsName[i] = fields[i].getName();
				}
			}
			for (int i = 0; i < fieldsName.length; i++) {
				Field field = o1.getClass().getDeclaredField(fieldsName[i]);
				String methodName = "";

				methodName = "get" + fieldsName[i].substring(0, 1).toUpperCase() + fieldsName[i].substring(1);
				Method getMethod = o1.getClass().getMethod(methodName);

				methodName = "set" + fieldsName[i].substring(0, 1).toUpperCase() + fieldsName[i].substring(1);;
				Method setMethod = o2.getClass().getMethod(methodName, field.getType());
				setMethod.invoke(o2, getMethod.invoke(o1));
			}
		} catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
	}
}
