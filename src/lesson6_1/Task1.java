����   < G
      java/lang/Object <init> ()V  https://my-site.com 
 '(http://|https://)(my-site).(com|ru|by)
      java/util/regex/Pattern compile -(Ljava/lang/String;)Ljava/util/regex/Pattern;
     matcher 3(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;	      java/lang/System out Ljava/io/PrintStream;
       java/util/regex/Matcher find ()Z
 " # $ % & java/io/PrintStream println (Z)V ( my-site * my-hidden-site
 , - . / 0 java/lang/String replace D(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
 " 2 % 3 (Ljava/lang/String;)V 5 lesson6_1/Task1 Code LineNumberTable LocalVariableTable this Llesson6_1/Task1; main ([Ljava/lang/String;)V args [Ljava/lang/String; str Ljava/lang/String; pattern Ljava/util/regex/Pattern; Ljava/util/regex/Matcher; str1 
SourceFile 
Task1.java ! 4           6   /     *� �    7        8        9 :   	 ; <  6   �     ,L	� M,+� N� -� � !+')� +:� � 1�    7         	 	 
     #  +  8   4    , = >    ) ? @  	 # A B     C  # 	 D @   E    F