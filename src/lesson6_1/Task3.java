����   < @
      java/lang/Object <init> ()V	  	 
   lesson6_1/Task3 str Ljava/lang/String;
      java/lang/String contains (Ljava/lang/CharSequence;)Z   
     replace D(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;  )Не содержится в строке  Hello, mens and women
     (Ljava/lang/String;)V	 ! " # $ % java/lang/System out Ljava/io/PrintStream; ' mens
  ) * + cut &(Ljava/lang/String;)Ljava/lang/String;
 - . / 0  java/io/PrintStream println Code LineNumberTable LocalVariableTable this Llesson6_1/Task3; s substr StackMapTable main ([Ljava/lang/String;)V args [Ljava/lang/String; task3 
SourceFile 
Task3.java !                 1   F     
*� *+� �    2          	  3       
 4 5     
     * +  1   n     *� +� � *� +� M,��    2       	  
     3        6      4 5      7   8     	 9 :  1   S     � Y� L�  +&� (� ,�    2        
    3        ; <   
  = 5   >    ?