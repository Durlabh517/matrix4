����   4�
  � �
  � �
  � �
  � �
  � �
  �
  �
  �
 
 
 
 
 	
 �

 
 
 $
 


 $	 �
 �	 �	 � 
 !
 +"
#$%&
 0 �
 1
'()
 5 �*
 7 �+,
 :
 9-./
 > �0
 @1
 '2
 > �
 52
 72
 73
425
678
 9:;
 �<=
6>?@ �A
BCDEF �GH �
 �IJKLMNOPQRSTUVWXY �Z[\]^_`abcde �fghijklmnop@�L     ��      @      qrstuv
wxy
z{|@
      
}~��   �#� 
���@`  
���������� 	testStdIn Z resyncMethod Ljava/lang/reflect/Method; 	testCount I <init> ()V Code LineNumberTable LocalVariableTable this LStdInTest; escape &(Ljava/lang/Object;)Ljava/lang/Object; u C idx c result Ljava/lang/StringBuilder; i len original Ljava/lang/Object; StackMapTable �� 	canResync ()Z e !Ljava/lang/NoSuchMethodException; test )(Ljava/lang/String;[[Ljava/lang/Object;)V input Ljava/lang/String; steps [[Ljava/lang/Object; *(Ljava/lang/String;[[Ljava/lang/Object;Z)V &Ljava/io/UnsupportedEncodingException; "Ljava/lang/IllegalAccessException; -Ljava/lang/reflect/InvocationTargetException; method errors Ljava/io/StringWriter; r rl el cmd expected preamble step [Ljava/lang/Object; useStdIn in LIn; count+%)*� main ([Ljava/lang/String;)V args [Ljava/lang/String; sb <clinit> 
SourceFile StdInTest.java � � java/lang/Character�� 	
"'\�� java/lang/StringBuilder \�� btnfr"'\��������� \u %04X java/lang/Object���� java/lang/String���� � ��� "��� � [ �����  �� ] StdIn resync java/lang/Class�� � � java/lang/NoSuchMethodException � � � � � � java/io/ByteArrayInputStream UTF-8�� ����� $java/io/UnsupportedEncodingException java/lang/RuntimeException���  java/lang/IllegalAccessException +java/lang/reflect/InvocationTargetException In java/util/Scanner �� Failed input %s
Step %d (%s)
 java/io/StringWriter java/io/PrintWriter ������� Expected array, got %s
��� Expected %d, got %d items:
%s
�� 
Expected [%d]=%s, got %s
 Expected %s, got %s
 � � 6Note: any errors appear duplicated since tests run 2x.�� 6Note: StdIn.resync is private, only In will be tested. this is a test isEmpty��� hasNextChar hasNextLine readAllStrings is a � � 


 readAll   		  		 readLine consumes newline
yeah! readLine readLine consumes newline readChar !readString doesn't consume spaces 
readString 

blank lines test blank lines test -   
  	 
  correct  
	
	 .trim replacement 
	 correct .trim replacement  this 
 and 	hat 
  and hat  1 2 3 
	 4 5  readAllInts  0 1 False true falsE True  readBoolean -               　     a b cdef b d ef cde f    

 

 
 
 3E4 	 -0.5 
 	 +4 readAllDoubles  whitespace  
whitespace  whitespace 
  whitespace 
   34 -12983   3.25
	 foo! readByte��� 	readShort��� 
readDouble��� 
	 foo! !30000000000  3.5 3e4, foo   		 ya readLong��� 	readFloat��� 3e4, foo ya   foo  foo  foo     foo   foo   foo Ran %d tests.
 	StdInTest [C java/lang/reflect/Method 	charValue ()C indexOf (I)I append -(Ljava/lang/String;)Ljava/lang/StringBuilder; charAt (I)C (C)Ljava/lang/StringBuilder; toString ()Ljava/lang/String; java/lang/Integer toOctalString (I)Ljava/lang/String; valueOf (I)Ljava/lang/Integer; format 9(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; toCharArray ()[C (C)Ljava/lang/Character; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; getClass ()Ljava/lang/Class; isArray (Ljava/lang/String;)V java/lang/reflect/Array 	getLength (Ljava/lang/Object;)I get '(Ljava/lang/Object;I)Ljava/lang/Object; 	getMethod @(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method; getBytes (Ljava/lang/String;)[B ([B)V java/lang/System setIn (Ljava/io/InputStream;)V invoke 9(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object; (Ljava/util/Scanner;)V (Ljava/io/Writer;)V printStackTrace (Ljava/io/PrintWriter;)V getCause ()Ljava/lang/Throwable; java/lang/Throwable StdOut printf ((Ljava/lang/String;[Ljava/lang/Object;)V equals (Ljava/lang/Object;)Z println (Ljava/lang/Object;)V java/lang/Boolean (Z)Ljava/lang/Boolean; java/lang/Byte (B)Ljava/lang/Byte; java/lang/Short (S)Ljava/lang/Short; java/lang/Double (D)Ljava/lang/Double; java/lang/Long (J)Ljava/lang/Long; java/lang/Float (F)Ljava/lang/Float; ! �     
 � �   
 � �   
 � �     � �  �   /     *� �    �       
 �        � �   	 � �  �      *� � w*� � <� =� � Y� � 	
� � � � � � Y� � 	� � 	� �~� &� Y� � 	� Y� S� � 	� �*�*� � T� Y� L*� � M,�>6� ,46+� � � W���� Y� � 	+� � 	� 	� �*� � � ;� Y� L*� =>� +� 	*�  � � W����+!� 	� �*�    �   b             3  9  P  V  y  {  �  �  �   �  � ! � # � $ � % � & � ' & ( * �   R   l � �   e � �  �  � �  � I � �  �  � �  � . � �  � ) � �    � �   �   2 
� 3(� �   � � �  � � �  �� � 	 	 � �  �   e     "#� $� %� &� K��      '  �       /  3  1  2  4 �       � �   �    Q � 	 � �  �   h     *+� (� )� 	*+� (� *`� *�    �       =  >  ?  @  A �        � �      � �  �     	 � �  �      EN� R� +Y*,� -� .� /� :� 1Y� 2� 3�� &� � 4W� 1:� 1Y� 6� 3�:� 1Y� 8� 3�� 9Y� :Y*� ;� <N6+:�66��2:2� :	2:
=:� "	� $� %:� -� 	� $� %:-� � 4:�:� >Y� ?:� @Y� A� B� 1Y� Y� � Y*SY� SY	S� � 	� C� 	� � 3�:� >Y� ?:� @Y� A� D� 1Y� Y� � Y*SY� SY	S� � 	� C� 	� � 3�:� >Y� ?:� @Y� A� E� F� @Y� A� G� 1Y� Y� � Y*SY� SY	S� � 	� C� 	� � 3�
� � �#� � � 7� Y� � 	H� 	� � Y*SY� SY	SYS� I�0:
:� 6� 6� N� Y� � 	J� 	� � Y*� SY� SY	SY� SY� SY� S� I� y6� o�  �  � K� U� Y� � 	L� 	� � Y*� SY� SY	SY� SY�  � SY�  � S� I����� L
� K� B� Y� � 	M� 	� � Y*� SY� SY	SY
� SY� S� I����2�     0 ( 4 7 5 ( 4 F 7 � � � ' � � 5 � �f 7  �  . K   D  E  G  K  I  J ( P 4 W 7 R 9 S F U H V U Z e \ h ] � ^ � _ � b � g � h � j � k � � � m � n � o � p � q p	 r t u! v/ wH xQ wY yf {h |q } ~� � �� � �� �� �� �� � � � � �  �' �. �J �s �y �� �� �� �� �� �� �� �� �� �� � �4 �8 �; �> ]D � �      � �  9  � �  H  � �  �  � �  �  � �  �  � �  � E � �  � N � � ! E � �  N � � q V � � h _ � � | s � �  � � �  � � �   � � � ' � � �  �� � � 	 �� � � 
�w � �  �� � �  �� � �   E � �    E � �   E � �  C � �  h� � �  �  7 �   � n �  �N �N ��   � n � n  � 4  � n � n S � �  �  �  ��   � n � n S � �  �  �� O �� O �� `  � n � n S � � � �  � I� g  � n � n S � � � � � �  � � l�   � n � n S � � � �  � H�   � n � n  �  	 � �  �      
x� N� )� )� O� P� Q� PR� SY� YTSY� USSY� YVSY� USSY� YWSY� USSY� YXSY� YYSYZSY[SY\SSSY� YTSY� USSY� YVSY� USSY� YWSY� USS� ]^� SY� YTSY� USSY� YVSY� USSY� YWSY� USSY� Y_SY^SS� ]`� SY� YTSY� USSY� YVSY� USSY� YWSY� USS� ]a� SY� YTSY� USSY� YVSY� USSY� YWSY� USSY� Y_SYaSS� ]b� SY� YcSYdSSY� YeSYy� SS� ]f� SY� YgSYgSSY� YeSY � SS� ]h� SY� YcSY`SSY� YcSY`SSY� YWSY� USSY� YcSYiSSY� YWSY� USS� ]j� SY� YXSY� YkSYlSYmSSSY� YVSY� USS� ]� Y� L�� nM>� M+�� W+@`�� W,h2eS,h`2eS,h2�� S,h`2@`�� S����+� ,� ]o	� SY� YgSYYSSY� YgSYpSSY� YeSY � SSY� YgSYqSSY� YeSY � SSY� YTSY� USSY� YWSY� USSY� YcSY`SSY� YcSYSS� ]r� SY� YsSY�
YOYOYOYOYOSS� ]t� SY� YuSY� USSY� YuSY� USSY� YuSY� USSY� YuSY� USSY� YuSY� USSY� YuSY� USS� ]v� SY� YgSYwSSY� YgSYxSSY� YVSY� USSY� YTSY� USSY� YeSY � SS� ]y� SY� YXSY� Y[SYzSY{SY|SY}SSS� ]y� SY� YcSY[SSY� YcSYzSSY� YcSY~SSY� YcSYSS� ]�� SY� YcSY`SSY� YWSY� USSY� YVSY� USSY� YcSY`SSY� YWSY� USSY� YVSY� USS� ]�� SY� YcSY`SSY� YWSY� USSY� YVSY� USSY� YcSY`SSY� YWSY� USSY� YVSY� USS� ]�� SY� YcSY`SSY� YWSY� USSY� YVSY� USSY� YcSY`SSY� YWSY� USSY� YVSY� USS� ]�� SY� YcSY`SSY� YWSY� USSY� YVSY� USSY� YcSY`SSY� YWSY� USSY� YVSY� USS� ]�� SY� YcSY`SSY� YVSY� USSY� YWSY� USS� ]�� SY� Y�SY�Y �RY �RY �RSS� ]�� SY� YgSY�SSY� YeSY � SSY� YWSY� USS� ]�� SY� YgSY�SSY� YeSY � SSY� YcSY`SSY� YWSY� USS� ]�� SY� YgSY�SSY� YeSY � SSY� YcSY`SSY� YWSY� USSY� YcSYSSY� YWSY� USS� ]�� SY� Y�SY"� �SSY� Y�SY�I� �SSY� Y�SY �� �SSY� Y_SY�SS� ]�� SY� Y�SY �� �SSY� Y�SY�� �SSY� YXSY� Y�SY�SY�SSS� ]�� SY� YXSY� Y�SY�SY�SY�SY�SY�SSS� ]�� SY� YXSY� Y�SY�SY�SSS� ]�� SY� YgSY�SSY� YgSY�SSY� YgSY�SSY� YgSY�SSY� YgSY�SSY� YgSY�SS� ]�� SY� YgSY�SSY� YgSY�SSY� YgSY�SS� ]�� Y� *� S� I�    �  � k   �  �  �  �  � . � � � � � � � � � � �$ �O �R �f �� �� �� �� �� �� �� � �7 �[ �` �c �� �� �� �� �� �� �� �� �� �� �� �� � � �E �j �� �� �� �� � �' �M �e �h �� �� �� �� �� � �Pv����
%=@f����-0Ump��!�"��$&('-$0)W+{,�-�)�/�1�2�3�/�6	8	)9	P6	S=	�B	�F
)L
eP
wQ �   * � Q � �   
x � �  �� � � �� � �  �    �� � n� P  � �  �         � *�    �         �    �