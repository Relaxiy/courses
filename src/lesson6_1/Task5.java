����   < D
      java/lang/Object <init> ()V	  	 
   lesson6_1/Task5 str Ljava/lang/String;
      java/lang/String indexOf (Ljava/lang/String;)I
     lastIndexOf
     length ()I  We always says no
     (Ljava/lang/String;)V	   ! " # $ java/lang/System out Ljava/io/PrintStream; & always
  ( ) * index (Ljava/lang/String;)[I
 , - . / 0 java/util/Arrays toString ([I)Ljava/lang/String;
 2 3 4 5  java/io/PrintStream println Code LineNumberTable LocalVariableTable this Llesson6_1/Task5; substr [I main ([Ljava/lang/String;)V args [Ljava/lang/String; task5 
SourceFile 
Task5.java !                 6   F     
*� *+� �    7         	 	 
 8       
 9 :     
     ) *  6   m     #�
M,*� +� O,*� +� +� `dO,�    7            !  8        # 9 :     # ;     ) <  	 = >  6   V     � Y� L� +%� '� +� 1�    7        
    8        ? @   
  A :   B    C