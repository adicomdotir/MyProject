package ir.javacup.convention;

public class CodeConventionUtil {

	public String getFieldsName(String... params){
		String strTemp = "";
		for (int i=0; i<params.length; i++) {
			params[i] = params[i].toLowerCase();
			if(i==0) {
				strTemp += params[i];
			}
			else {
				strTemp += params[i].substring(0, 1).toUpperCase() + params[i].substring(1);
			}
		}
		return strTemp;
	}
	
	public String getMethodsName(String... params){
		String strTemp = "";
		for (int i=0; i<params.length; i++) {
			params[i] = params[i].toLowerCase();
			if(i==0) {
				strTemp += params[i];
			}
			else {
				strTemp += params[i].substring(0, 1).toUpperCase() + params[i].substring(1);
			}
		}
		return strTemp;
	}
	
	public String getClassName(String... params){
		String strTemp = "";
		for (int i=0; i<params.length; i++) {
			params[i] = params[i].toLowerCase();
			strTemp += params[i].substring(0, 1).toUpperCase() + params[i].substring(1);
		}
		return strTemp;
	}
	
	public String getConstantsName(String... params){
		String strTemp = "";
		for (int i=0; i<params.length; i++) {
			params[i] = params[i].toUpperCase();
			if(i==0) {
				strTemp += params[i];
			}
			else {
				strTemp += "_" + params[i];
			}
		}
		return strTemp;
	}
	
	
	
	

}
