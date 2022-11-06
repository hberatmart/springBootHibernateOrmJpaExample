# springBootHibernateOrmJpaExample

JAVADA LOCAL DATABASE KURULUMU
BU PROJEDE YAPLAMASI İSTENENLER
•	Java spring uygulaması ayağa kaldırılması
•	Local database kurulumu (mysql, postgresql veya herhangi bir database)
•	İki adet tablo yer almalı ve bu tabloların birbirleriyle bağı olmalıdır. (Örn: şirket ve çalışan gibi),
•	Java spring uygulamasında ekleme, silme, güncelleme, listeleme gibi servisler yer almalıdır ve  responseda yapılan işlem detayı return edilmelidir.
•	Ekleme, silme, güncelleme, listeleme işlemlerini postman vb ile işlem yapılabilmelidir.

KOD BÖLÜMÜNDE YAPILACAK DEĞİŞİKLİKLER
•	Database olarak MySQL Kullanıldı.
•	Application.properties dosyasında gerekli düzeltmeler alt kısımda anlatılmaktadır.
![image](https://user-images.githubusercontent.com/91989518/200198341-a703978e-110f-4912-aff5-34c12c2219d7.png)
•	5. Satırda bulunan {database adi} bölümüne MySQL’de oluşturulan şema adı girilmesi gerekir. Tablo oluşturulmamalıdır.
•	6. Satırda bulunan {username} bölümüne MySQL’de giriş yaparken kullandığın kullanıcı adı girilmesi gerekir.
•	7. Satırda bulunan {password} bölümüne MySQL’de giriş yaparken kullandığın şifre girilmesi gerekir.

KULLANIMDA YAPILMASI GEREKENLER;
•	City ve Country olarak iki adet tablo oluşturulmaktadır. Burada City tablosu ile Country tablosu ilişkilendirilmiştir. City’de bulunan country_id alanı Country’nin country_id alanı ile ilişkilidir. Kısaca tablo bilgisi verilmesi gerekirse; City tablosunda bulunanlar city_id , city, population ve country_id bulunmaktadır. Country tablosunda bulunanlar ise country_id, country ve population bulunmaktadır.  
•	Postman ile crud işlemlerini test etmek için gerekli bilgiler aşağıda verilmiştir. 
NOT: Öncelikli olarak Country oluşturulup sonra City oluşturulması gerekir.
•   Country tablosu için crud işlemlerinin adımları;
      	Bütün bir liste dönülmek isteniyor ise aşağıda yazılan url yazılması gerekir. Get ile birlikte http://localhost:8081/api/country/countries kullanılmalıdır
![image](https://user-images.githubusercontent.com/91989518/200198428-78a899cf-c017-4653-850d-a8436c1af1e1.png)
      
      	Listeden tek değer dönülmesi isteniyorsa aşağıda yazılan url yazılması gerekir Get ile birlikte http://localhost:8081/api/country/countries/{id} kullanılmalıdır.  
![image](https://user-images.githubusercontent.com/91989518/200198436-eaaa683c-ff5a-4ddb-afaa-a76b2469daf1.png)

      	Ekleme işlemi yapılmak istenirse country_id yazılmadan aşağıda yazılan url yazılması gerekir Post ile birlikte http://localhost:8081/api/country/add kullanılmalıdır. Body bölümünde raw alanı seçilip tipide json olarak ayarlanması gerekir.  
![image](https://user-images.githubusercontent.com/91989518/200198445-f68803c4-e90b-4c62-8ffc-65cd065ff6a8.png)

      	Silme işlemi yapılmak istenirse bütün bilgiler ile aşağıda yazılan url yazılması gerekir Post ile birlikte http://localhost:8081/api/country/delete kullanılmadır. Body bölümünde raw alanı seçilip tipide json olarak ayarlanması gerekir.    
![image](https://user-images.githubusercontent.com/91989518/200198482-6d344312-5e19-41ad-b50c-79a4d51eaf0d.png)

      	Güncelleme işlemi yapılmak istenirse bütün bilgiler ile aşağıda yazılan url yazılması gerekir. Post ile birlikte http://localhost:8081/api/country/update kullanılmadır. Body bölümünde raw alanı seçilip tipide json olarak ayarlanması gerekir.   
![image](https://user-images.githubusercontent.com/91989518/200198489-56e5825a-137c-473f-b128-5fd36f665783.png)
      
•   City tablosu için crud işlemlerinin adımları;
       	Bütün bir liste dönülmek isteniyor ise aşağıda yazılan url yazılması gerekir. Get ile birlikte http://localhost:8081/api/city/cities kullanılmalıdır.
![image](https://user-images.githubusercontent.com/91989518/200198581-8ab3cdb7-6e9a-4dbb-95e1-652f6c957c54.png)

       	Listeden tek değer dönülmesi isteniyorsa aşağıda yazılan url yazılması gerekir Get ile birlikte http://localhost:8081/api/city/cities/{id} kullanılmalıdır.
![image](https://user-images.githubusercontent.com/91989518/200198597-df7f88fa-e4bc-4d93-9aa7-b48401495e3d.png)

       	Ekleme işlemi yapılmak istenirse city_id yazılmadan aşağıda yazılan url yazılması gerekir Post ile birlikte http://localhost:8081/api/city/add kullanılmalıdır. Body bölümünde raw alanı seçilip tipide json olarak ayarlanması gerekir.    
![image](https://user-images.githubusercontent.com/91989518/200198607-fae475c0-5b89-40dc-9e40-c44a15a8b247.png)

       	Silme işlemi yapılmak istenirse bütün bilgiler ile aşağıda yazılan url yazılması gerekir Post ile birlikte http://localhost:8081/api/city/delete kullanılmadır. Body bölümünde raw alanı seçilip tipide json olarak ayarlanması gerekir.  
![image](https://user-images.githubusercontent.com/91989518/200198617-0d341041-dbad-4202-beaf-64b2ca82d023.png)

       	Güncelleme işlemi yapılmak istenirse bütün bilgiler ile aşağıda yazılan url yazılması gerekir. Post ile birlikte http://localhost:8081/api/city/update kullanılmadır. Body bölümünde raw alanı seçilip tipide json olarak ayarlanması gerekir.  
![image](https://user-images.githubusercontent.com/91989518/200198623-a30d5371-d039-4d24-9162-46938f87883c.png)



