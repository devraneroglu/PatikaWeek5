/*
1-) film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
*/
SELECT DISTINCT REPLACEMENT_COST FROM FILM ORDER BY REPLACEMENT_COST ASC
/*
2-) film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
*/
SELECT COUNT(DISTINCT REPLACEMENT_COST) FROM FILM 
/*
3-) film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
*/
SELECT COUNT(TITLE) FROM FILM WHERE RATING='G' AND TITLE LIKE 'T%'
/*
4-) country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
*/
SELECT COUNT(*) FROM COUNTRY WHERE LENGTH(COUNTRY)=5
/*
5-)city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?
*/
SELECT COUNT(*) FROM CITY WHERE CITY LIKE '%R' OR CITY LIKE '%r'
