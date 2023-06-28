INSERT INTO radnik (idbr,ime,posao, kvalifikacija, rukovodilac, datum_zaposlenja, premija, plata, broj_odeljenja)VALUES (6666,'Nikola', 'QA Tester','VSS',5780, '2023-06-25', 800 , 3500, 10);
SELECT * FROM odeljenje;
SELECT ime, kvalifikacija, plata FROM radnik ;
UPDATE radnik SET kvalifikacija='VK' , plata= 2800 WHERE ime='Nikola';
SELECT imeproj, sredstva FROM projekat WHERE sredstva<=3000000;