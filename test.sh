#!/bin/bash
read -p "What is your name? " name
echo "Hello $name"
if [ "$name" == "adicom" ];then
	echo "You are admin!"
else
	echo "You are ghost"
	exit
fi
ls
read -p "Please enter a directory name : " dir
if [ -d "$HOME/$dir" ];then
	echo "Exist!"
else
	echo -e "Directory not existed\nDo you want create $dir (y/n)?"
	read answer
	if [ "$answer" == "y" ];then
		mkdir "$directory"
	else
		echo "Bye!"
	fi
fi

