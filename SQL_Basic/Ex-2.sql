/*
1-)film tablosunda bulunan tüm sütunlardaki verileri replacement cost değeri 12.99 dan büyük eşit ve 16.99 küçük olma
koşuluyla sıralayınız ( BETWEEN - AND yapısını kullanınız.)
*/
SELECT REPLACEMENT_COST,* FROM FILM WHERE REPLACEMENT_COST>12.99 AND  REPLACEMENT_COST<16.99 ORDER BY REPLACEMENT_COST ASC
/*
2-)actor tablosunda bulunan first_name ve last_name sütunlardaki verileri first_name 'Penelope' veya 'Nick' veya 'Ed' değerleri 
olması koşuluyla sıralayınız. ( IN operatörünü kullanınız.)
*/
SELECT FIRST_NAME,LAST_NAME FROM ACTOR WHERE FIRST_NAME='Penelope' OR FIRST_NAME='Nick' OR FIRST_NAME = 'Ed' 
SELECT COUNT(FIRST_NAME)  ,FIRST_NAME FROM ACTOR WHERE FIRST_NAME='Penelope' OR FIRST_NAME='Nick' OR FIRST_NAME = 'Ed' GROUP BY FIRST_NAME
/*
3-)film tablosunda bulunan tüm sütunlardaki verileri rental_rate 0.99, 2.99, 4.99 VE replacement_cost 12.99, 15.99, 28.99 olma 
koşullarıyla sıralayınız. ( IN operatörünü kullanınız.)
*/
SELECT RENTAL_RATE,REPLACEMENT_COST,* FROM FILM WHERE RENTAL_RATE IN (0.99,2.99,4.99) AND REPLACEMENT_COST IN (12.99, 15.99, 28.99) ORDER BY RENTAL_RATE,REPLACEMENT_COST ASC

