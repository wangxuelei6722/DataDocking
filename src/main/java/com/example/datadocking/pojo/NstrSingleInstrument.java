package com.example.datadocking.pojo;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Entity
@Table(name = "nstr_single_instrument")
public class NstrSingleInstrument {

  @Id
  private int id;
  private String cname;
  private String ename;
  private String devId;
  private String ip;
  private int ins;
  private String insCode;
  private int instrBeintsType;
  private int instrBeintsId;
  private int instrBeintsCenterId;
  private int instrBeintsDeviceId;
  private int consumableId;
  private int instrBeintsUnitId;
  private String instrBeintsName;
  private String innerId;
  private String instrCategory;
  private int instrSource;
  private int instrSupervise;
  private double worth;
  private String nation;
  private String manufacturer;
  private java.sql.Date beginDate;
  private int type;
  private String instrVersion;
  private String technical;
  private String function;
  private String subject;
  private String serviceContent;
  private String achievement;
  private int image;
  private int status;
  private String requirement;
  private String fee;
  private String serviceUrl;
  private String locationCode;
  private String location;
  private String contact;
  private String phone;
  private String email;
  private String address;
  private String postalcode;
  private int instruType;
  private double lng;
  private double lat;
  private int dataHint;
  private String year;
  private int auditStatus;
  private String auditReason;
  private int shareMode;
  private int orderType;
  private int orderTimes;
  private String manual;
  private int insid;
  private int userid;
  private Date insertTime;
  private Date updateTime;
  private Date auditTime;
  private double runMachine;
  private double serviceMachine;
  private String funds;
  private String insideDepart;
  private int clickNum;
  private int collectionTimes;
  private String room;
  private String usageMode;
  private int openAccess;
  private int controlMode;
  private int bookingProcess;
  private int reservaForm;
  private String advanceDays;
  private String minTime;
  private String maxTime;
  private String startTime;
  private int maxDay;
  private String workTime;
  private int classification;
  private int orgId;
  private int nominate;
  private int reportingState;
  private int flag;
  private int singleCancel;
  private String declarationNumber;
  private Date importDate;
  private String itemNumber;
  private String formname;
  private String otherInsid;
  private String profileId;
  private int reportingIf;


}
