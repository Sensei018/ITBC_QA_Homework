SELECT ime, posao FROM radnik WHERE broj_odeljenja= 10 AND (posao= 'analiticar' OR posao= 'upravnik');
SELECT ime FROM radnik WHERE ime NOT LIKE '%A%' AND ime NOT LIKE '%a%' LIMIT 5;
SELECT ime, plata FROM radnik WHERE plata BETWEEN 2600 AND 3000;
SELECT ime, plata, premija FROM radnik WHERE posao= 'vozac' ORDER BY premija DESC;