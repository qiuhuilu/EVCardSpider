# EVCardSpider
1.查询站点车辆接口
https://mas.evcard.vip:8443/evcard-mas/evcardapp?service=getVehicleInfoList

{
    "serialNum" : 0,
    "token" : "51f3cfbf-7856-4661-8b12-5e3fe1ab066a",
    "approvedSeats" : -1,
    "areaCode" : null,
    "canRent" : 1,
    "drivingRange" : 0,
    "serviceStatus" : -1,
    "shopName" : null,
    "shopSeq" : 0,
    "soc" : -1,
    "vehicleModelName" : null,
    "vehicleModelSeq" : "",
    "vehicleNo" : null,
    "vin" : null
}

2.查询站点
https://mas.evcard.vip:8443/evcard-mas/getShopBaseInfoGzip

{
    "token" : "c368fa9e-751b-405c-8799-76b80c91bcdf",
    "updatedTime" : "20170511213302762"
}

车辆信息：
CREATE TABLE `evcar` (
  `id` int(11) NOT NULL,
  `shopSeq` int(11) DEFAULT NULL,
  `shopName` varchar(200) DEFAULT NULL,
  `areaCode` varchar(45) DEFAULT NULL,
  `vin` varchar(45) DEFAULT NULL,
  `vehicleNo` varchar(45) DEFAULT NULL,
  `vehicleModelSeq` int(11) DEFAULT NULL,
  `vehicleModelName` varchar(45) DEFAULT NULL,
  `soc` int(11) DEFAULT NULL,
  `serviceStatus` int(11) DEFAULT NULL,
  `canRent` int(11) DEFAULT NULL,
  `approvedSeats` int(11) DEFAULT NULL,
  `drivingRange` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `bugDate` varchar(45) DEFAULT NULL,
  `disinfectDate` varchar(45) DEFAULT NULL,
  `mileage` int(11) DEFAULT NULL,
  `bodyColor` int(11) DEFAULT NULL,
  `priceDesc` varchar(45) DEFAULT NULL,
  `oprerationOrgId` varchar(45) DEFAULT NULL,
  `isDisplayInsurance` int(11) DEFAULT NULL,
  `isForceInsurance` int(11) DEFAULT NULL,
  `isDisplayCross` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `vehicleNo_UNIQUE` (`vehicleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

站点信息：
CREATE TABLE `evshop` (
  `shopSeq` int(11) NOT NULL,
  `shopName` varchar(45) NOT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `areaCode` varchar(45) DEFAULT NULL,
  `latitude` int(11) DEFAULT NULL,
  `longtitude` int(11) DEFAULT NULL,
  `shopPicUrl` varchar(200) DEFAULT NULL,
  `forPublic` int(11) DEFAULT NULL,
  `updatedTime` date DEFAULT NULL,
  `agencyId` varchar(45) DEFAULT NULL,
  `restrict` int(11) DEFAULT NULL,
  `deleteFlag` int(11) DEFAULT NULL,
  `shopProperty` int(11) DEFAULT NULL,
  `pickVehAmount` float DEFAULT NULL,
  `returnVehAmount` float DEFAULT NULL,
  `chargeStandards` varchar(200) DEFAULT NULL,
  `navigateAddress` varchar(200) DEFAULT NULL,
  `shopType` int(11) DEFAULT NULL,
  `stackType` varchar(200) DEFAULT NULL,
  `shopOpenTime` varchar(45) DEFAULT NULL,
  `shopCloseTime` varchar(45) DEFAULT NULL,
  `orgId` varchar(45) NOT NULL,
  `grade` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`shopSeq`),
  UNIQUE KEY `shopSeq_UNIQUE` (`shopSeq`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
