/*
1-) film tablosunda bulunan title ve description sütunlarındaki verileri sıralayınız.
ORDER BY [String COLOMN NAME]  ASC --> a dan z ye ,      ORDER BY [ String COLOMN NAME] DESC -->  Z dan a ya sıralar
ORDER BY [Numeric COLOMN NAME] ASC --> küçükten büyüğe , ORDER BY [ String COLOMN NAME] DESC -->  büyükten küçüğe sıralar
*/
SELECT TITLE , DESCRIPTION FROM FILM ORDER BY TITLE ASC  
SELECT TITLE , DESCRIPTION FROM FILM ORDER BY TITLE DESC    
/*
2-) film tablosunda bulunan tüm sütunlardaki verileri film uzunluğu (length) 60 dan büyük VE 75 ten küçük olma koşullarıyla sıralayınız.
*/
SELECT LENGTH,* FROM FILM WHERE LENGTH>60 AND LENGTH<75 ORDER BY LENGTH ASC
/*
3-)film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99 VE replacement_cost 12.99 VEYA 28.99 olma koşullarıyla sıralayınız.
*/
SELECT RENTAL_RATE,REPLACEMENT_COST,* FROM FILM WHERE RENTAL_RATE = 0.99 AND (REPLACEMENT_COST=12.99 OR REPLACEMENT_COST=28.99) 
/*
4-)customer tablosunda bulunan first_name sütunundaki değeri 'Mary' olan müşterinin last_name sütunundaki değeri nedir?
*/
SELECT LAST_NAME FROM CUSTOMER WHERE FIRST_NAME ='Mary'
/*
5-)film tablosundaki uzunluğu(length) 50 ten büyük OLMAYIP aynı zamanda rental_rate değeri 2.99 veya 4.99 OLMAYAN verileri sıralayınız.
*/
SELECT LENGTH,RENTAL_RATE,* FROM FILM WHERE NOT LENGTH>50 AND  NOT(RENTAL_RATE = 2.99 OR RENTAL_RATE = 4.99) 
SELECT DISTINCT RENTAL_RATE FROM FILM