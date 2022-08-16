create table hw.visitors(id serial unique not null primary key, full_name varchar not null,gender boolean not null,birth_date date not null);
create table hw.coach(id serial unique not null primary key, full_name varchar not null, sport varchar not null, phone varchar unique not null);
create table hw.visits(visitor int not null, coach int not null, train_date timestamp, foreign key (visitor) references hw.visitors(id), foreign key (coach) references hw.coach(id));
alter table hw.coach alter column sport type varchar;
insert into hw.visitors  (full_name,gender,birth_date) values ('Daron Arranovsky',true,'12-05-2003');
insert into hw.coach (full_name,sport,phone) values ('Trainy Train','tennis','+996505121212');
insert into hw.visits (visitor,coach,train_date)values(1,1,'12-12-2019');