/*
1-country tablosunda bulunan country sütunundaki ülke isimlerinden 'A' karakteri ile başlayıp 'a' karakteri ile sonlananları sıralayınız.
*/
SELECT * FROM COUNTRY WHERE COUNTRY LIKE 'A%a'
/*
2-country tablosunda bulunan country sütunundaki ülke isimlerinden en az 6 karakterden oluşan ve sonu 'n' karakteri ile sonlananları sıralayınız.
*/
SELECT * FROM COUNTRY WHERE LENGTH(COUNTRY)>=6 AND COUNTRY LIKE '%n' ORDER BY LENGTH(COUNTRY) ASC

/*
3-film tablosunda bulunan title sütunundaki film isimlerinden en az 4 adet büyük ya da küçük harf farketmesizin 'T' karakteri içeren film isimlerini sıralayınız.
*/
SELECT TITLE  FROM FILM WHERE (LENGTH(LOWER(TITLE)) - LENGTH(LOWER(REPLACE(TITLE,'t',''))))>=4
/*
4-film tablosunda bulunan tüm sütunlardaki verilerden title 'C' karakteri ile başlayan ve uzunluğu (length) 90 dan büyük olan ve rental_rate 2.99 olan
verileri sıralayınız.
*/
SELECT * FROM FILM WHERE TITLE LIKE 'C%' AND LENGTH>90 AND RENTAL_RATE = 2.99 ORDER BY LENGTH ASC
