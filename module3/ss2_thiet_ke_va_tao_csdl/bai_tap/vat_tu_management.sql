drop database if exists nhap_xuat_vat_tu;
create database nhap_xuat_vat_tu;
use nhap_xuat_vat_tu;
create table phieu_xuat(
so_px int auto_increment,
ngay_xuat date,
primary key(so_px));
create table phieu_nhap(
so_pn int auto_increment,
ngay_nhap date,
primary key(so_pn));
create table vat_tu(
ma_vat_tu int ,
ten_vat_tu varchar(45),
primary key(ma_vat_tu));
create table chi_tiet_phieu_xuat(
so_px int,
ma_vat_tu int,
don_gia_xuat double,
so_luong_xuat int,
primary key(so_px,ma_vat_tu),
foreign key(so_px) references phieu_xuat(so_px),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu));
create table chi_tiet_phieu_nhap(
so_pn int ,
ma_vat_tu int,
don_gia_nhap double,
so_luong_nhap int,
primary key(so_pn,ma_vat_tu),
foreign key(so_pn) references phieu_nhap(so_pn),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu));
create table nha_cung_cap(
ma_nha_cung_cap int primary key auto_increment,
ten_nha_cung_cap varchar(255) not null,
dia_chi_nha_cung_cap varchar(255));

create table so_dien_thoai_nha_cung_cap(
ma_so_dien_thoai int primary key auto_increment,
ma_nha_cung_cap int,
so_dien_thoai varchar(255),
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap));

create table don_dat_hang(
so_don_hang int primary key auto_increment,
ma_nha_cung_cap int,
ngay_dat_hang date,
foreign key(ma_nha_cung_cap) references nha_cung_cap(ma_nha_cung_cap));

create table chi_tiet_don_dat_hang(
so_don_hang int,
ma_vat_tu int,
primary key(so_don_hang,ma_vat_tu),
foreign key(so_don_hang) references don_dat_hang(so_don_hang),
foreign key(ma_vat_tu) references vat_tu(ma_vat_tu));