
--Location inserts
insert into "LOCATION" (state,city,zipCode)
VALUES('VA','Reston','20190');

insert into "LOCATION" (state,city,zipCode)
VALUES('FL','Tampa','33620');

insert into "LOCATION" (state,city,zipCode)
VALUES('TX','Reston','20190');

--Building Inserts
insert into "BUILDING" (city,street_address, location_id, total_floors)
VALUES('Reston','11730 Plaza America Dr',1, 6),
('Tampa','4202 E Fowler Ave',2, 4),
('Tampa','USF Apple Dr',2, 7),
('Arlington','701 S Nedderman Dr',3, 3);
--
----Room Inserts
insert into "ROOM" (name,type,capacity,building_id)
VALUES('201',1,30,1),
('202',1,45,1),
('203',1,30,1),
('204',1,20,1),
('205',1,35,1),
('206',2,12,1),
('207',2,4,1),
('208',2,3,1),
('209',2,3,1),
('306',3,2,1),
('301',1,60,2),
('303',1,35,2),
('332',2,5,2),
('333',2,4,2),
('334',2,4,2),
('220',1,30,3),
('221',1,40,3),
('224',3,3,3),
('225',2,3,3),
('227',2,3,3),
('136',1,45,4),
('140',1,25,4),
('166',2,4,4),
('167',2,5,4),
('168',2,3,4);
