����   < 8
      java/lang/Object <init> ()V  lesson7/Task2/User	 
     lesson7/Task2/Store users [Llesson7/Task2/User;
     getLogin ()Ljava/lang/String;
      java/lang/String equals (Ljava/lang/Object;)Z
     getPassword  .lesson7/Task2/Exceptions/UserNotFoundException
     .lesson7/Task2/Exceptions/ArrayFillingException
   (I)V Code LineNumberTable LocalVariableTable this Llesson7/Task2/Store; length I getUser :(Ljava/lang/String;Ljava/lang/String;)Llesson7/Task2/User; i login Ljava/lang/String; password StackMapTable 
Exceptions addUser (Llesson7/Task2/User;)V user Llesson7/Task2/User; 
SourceFile 
Store.java ! 
              "  #   I     *� *� � 	�    $       	  
   %        & '      ( )   * +  #   �     @>*� 	�� 0*� 	2� +� � *� 	2� ,� � 
*� 	2����ͻ Y� �    $          +  2  8  %   *   6 , )    @ & '     @ - .    @ / .  0   
 � /�  1       2 3  #   �     *=*� 	�� *� 	2� *� 	+S����� Y� !�    $                "  %         , )    * & '     * 4 5  0   
 � �  1       6    7