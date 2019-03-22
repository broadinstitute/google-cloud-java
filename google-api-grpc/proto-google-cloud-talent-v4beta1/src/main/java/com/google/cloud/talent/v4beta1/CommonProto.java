// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_TimestampRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Location_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Location_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_RequestMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ResponseMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/talent/v4beta1/common.pro"
          + "to\022\033google.cloud.talent.v4beta1\032\034google/"
          + "api/annotations.proto\032\037google/protobuf/t"
          + "imestamp.proto\032\036google/protobuf/wrappers"
          + ".proto\032\030google/type/latlng.proto\032\027google"
          + "/type/money.proto\032 google/type/postal_ad"
          + "dress.proto\"n\n\016TimestampRange\022.\n\nstart_t"
          + "ime\030\001 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "amp\"\267\003\n\010Location\022I\n\rlocation_type\030\001 \001(\0162"
          + "2.google.cloud.talent.v4beta1.Location.L"
          + "ocationType\0222\n\016postal_address\030\002 \001(\0132\032.go"
          + "ogle.type.PostalAddress\022$\n\007lat_lng\030\003 \001(\013"
          + "2\023.google.type.LatLng\022\024\n\014radius_miles\030\004 "
          + "\001(\001\"\357\001\n\014LocationType\022\035\n\031LOCATION_TYPE_UN"
          + "SPECIFIED\020\000\022\013\n\007COUNTRY\020\001\022\027\n\023ADMINISTRATI"
          + "VE_AREA\020\002\022\033\n\027SUB_ADMINISTRATIVE_AREA\020\003\022\014"
          + "\n\010LOCALITY\020\004\022\017\n\013POSTAL_CODE\020\005\022\020\n\014SUB_LOC"
          + "ALITY\020\006\022\022\n\016SUB_LOCALITY_1\020\007\022\022\n\016SUB_LOCAL"
          + "ITY_2\020\010\022\020\n\014NEIGHBORHOOD\020\t\022\022\n\016STREET_ADDR"
          + "ESS\020\n\"\237\001\n\017RequestMetadata\022\016\n\006domain\030\001 \001("
          + "\t\022\022\n\nsession_id\030\002 \001(\t\022\017\n\007user_id\030\003 \001(\t\022\031"
          + "\n\021allow_missing_ids\030\004 \001(\010\022<\n\013device_info"
          + "\030\005 \001(\0132\'.google.cloud.talent.v4beta1.Dev"
          + "iceInfo\"&\n\020ResponseMetadata\022\022\n\nrequest_i"
          + "d\030\001 \001(\t\"\317\001\n\nDeviceInfo\022G\n\013device_type\030\001 "
          + "\001(\01622.google.cloud.talent.v4beta1.Device"
          + "Info.DeviceType\022\n\n\002id\030\002 \001(\t\"l\n\nDeviceTyp"
          + "e\022\033\n\027DEVICE_TYPE_UNSPECIFIED\020\000\022\007\n\003WEB\020\001\022"
          + "\016\n\nMOBILE_WEB\020\002\022\013\n\007ANDROID\020\003\022\007\n\003IOS\020\004\022\007\n"
          + "\003BOT\020\005\022\t\n\005OTHER\020\006\"Q\n\017CustomAttribute\022\025\n\r"
          + "string_values\030\001 \003(\t\022\023\n\013long_values\030\002 \003(\003"
          + "\022\022\n\nfilterable\030\003 \001(\010\"W\n\022SpellingCorrecti"
          + "on\022\021\n\tcorrected\030\001 \001(\010\022\026\n\016corrected_text\030"
          + "\002 \001(\t\022\026\n\016corrected_html\030\003 \001(\t\"\234\t\n\020Compen"
          + "sationInfo\022P\n\007entries\030\001 \003(\0132?.google.clo"
          + "ud.talent.v4beta1.CompensationInfo.Compe"
          + "nsationEntry\022k\n\"annualized_base_compensa"
          + "tion_range\030\002 \001(\0132?.google.cloud.talent.v"
          + "4beta1.CompensationInfo.CompensationRang"
          + "e\022l\n#annualized_total_compensation_range"
          + "\030\003 \001(\0132?.google.cloud.talent.v4beta1.Com"
          + "pensationInfo.CompensationRange\032\222\003\n\021Comp"
          + "ensationEntry\022L\n\004type\030\001 \001(\0162>.google.clo"
          + "ud.talent.v4beta1.CompensationInfo.Compe"
          + "nsationType\022L\n\004unit\030\002 \001(\0162>.google.cloud"
          + ".talent.v4beta1.CompensationInfo.Compens"
          + "ationUnit\022$\n\006amount\030\003 \001(\0132\022.google.type."
          + "MoneyH\000\022P\n\005range\030\004 \001(\0132?.google.cloud.ta"
          + "lent.v4beta1.CompensationInfo.Compensati"
          + "onRangeH\000\022\023\n\013description\030\005 \001(\t\022=\n\027expect"
          + "ed_units_per_year\030\006 \001(\0132\034.google.protobu"
          + "f.DoubleValueB\025\n\023compensation_amount\032o\n\021"
          + "CompensationRange\022,\n\020max_compensation\030\002 "
          + "\001(\0132\022.google.type.Money\022,\n\020min_compensat"
          + "ion\030\001 \001(\0132\022.google.type.Money\"\265\001\n\020Compen"
          + "sationType\022!\n\035COMPENSATION_TYPE_UNSPECIF"
          + "IED\020\000\022\010\n\004BASE\020\001\022\t\n\005BONUS\020\002\022\021\n\rSIGNING_BO"
          + "NUS\020\003\022\n\n\006EQUITY\020\004\022\022\n\016PROFIT_SHARING\020\005\022\017\n"
          + "\013COMMISSIONS\020\006\022\010\n\004TIPS\020\007\022\033\n\027OTHER_COMPEN"
          + "SATION_TYPE\020\010\"\234\001\n\020CompensationUnit\022!\n\035CO"
          + "MPENSATION_UNIT_UNSPECIFIED\020\000\022\n\n\006HOURLY\020"
          + "\001\022\t\n\005DAILY\020\002\022\n\n\006WEEKLY\020\003\022\013\n\007MONTHLY\020\004\022\n\n"
          + "\006YEARLY\020\005\022\014\n\010ONE_TIME\020\006\022\033\n\027OTHER_COMPENS"
          + "ATION_UNIT\020\007*y\n\013CompanySize\022\034\n\030COMPANY_S"
          + "IZE_UNSPECIFIED\020\000\022\010\n\004MINI\020\001\022\t\n\005SMALL\020\002\022\013"
          + "\n\007SMEDIUM\020\003\022\n\n\006MEDIUM\020\004\022\007\n\003BIG\020\005\022\n\n\006BIGG"
          + "ER\020\006\022\t\n\005GIANT\020\007*\342\001\n\nJobBenefit\022\033\n\027JOB_BE"
          + "NEFIT_UNSPECIFIED\020\000\022\016\n\nCHILD_CARE\020\001\022\n\n\006D"
          + "ENTAL\020\002\022\024\n\020DOMESTIC_PARTNER\020\003\022\022\n\016FLEXIBL"
          + "E_HOURS\020\004\022\013\n\007MEDICAL\020\005\022\022\n\016LIFE_INSURANCE"
          + "\020\006\022\022\n\016PARENTAL_LEAVE\020\007\022\023\n\017RETIREMENT_PLA"
          + "N\020\010\022\r\n\tSICK_DAYS\020\t\022\014\n\010VACATION\020\n\022\n\n\006VISI"
          + "ON\020\013*\216\002\n\nDegreeType\022\033\n\027DEGREE_TYPE_UNSPE"
          + "CIFIED\020\000\022\025\n\021PRIMARY_EDUCATION\020\001\022\035\n\031LOWER"
          + "_SECONDARY_EDUCATION\020\002\022\035\n\031UPPER_SECONDAR"
          + "Y_EDUCATION\020\003\022\034\n\030ADULT_REMEDIAL_EDUCATIO"
          + "N\020\004\022\034\n\030ASSOCIATES_OR_EQUIVALENT\020\005\022\033\n\027BAC"
          + "HELORS_OR_EQUIVALENT\020\006\022\031\n\025MASTERS_OR_EQU"
          + "IVALENT\020\007\022\032\n\026DOCTORAL_OR_EQUIVALENT\020\010*\334\001"
          + "\n\016EmploymentType\022\037\n\033EMPLOYMENT_TYPE_UNSP"
          + "ECIFIED\020\000\022\r\n\tFULL_TIME\020\001\022\r\n\tPART_TIME\020\002\022"
          + "\016\n\nCONTRACTOR\020\003\022\024\n\020CONTRACT_TO_HIRE\020\004\022\r\n"
          + "\tTEMPORARY\020\005\022\n\n\006INTERN\020\006\022\r\n\tVOLUNTEER\020\007\022"
          + "\014\n\010PER_DIEM\020\010\022\022\n\016FLY_IN_FLY_OUT\020\t\022\031\n\025OTH"
          + "ER_EMPLOYMENT_TYPE\020\n*q\n\010JobLevel\022\031\n\025JOB_"
          + "LEVEL_UNSPECIFIED\020\000\022\017\n\013ENTRY_LEVEL\020\001\022\017\n\013"
          + "EXPERIENCED\020\002\022\013\n\007MANAGER\020\003\022\014\n\010DIRECTOR\020\004"
          + "\022\r\n\tEXECUTIVE\020\005*\272\006\n\013JobCategory\022\034\n\030JOB_C"
          + "ATEGORY_UNSPECIFIED\020\000\022\032\n\026ACCOUNTING_AND_"
          + "FINANCE\020\001\022\035\n\031ADMINISTRATIVE_AND_OFFICE\020\002"
          + "\022\035\n\031ADVERTISING_AND_MARKETING\020\003\022\017\n\013ANIMA"
          + "L_CARE\020\004\022\032\n\026ART_FASHION_AND_DESIGN\020\005\022\027\n\023"
          + "BUSINESS_OPERATIONS\020\006\022\033\n\027CLEANING_AND_FA"
          + "CILITIES\020\007\022\023\n\017COMPUTER_AND_IT\020\010\022\020\n\014CONST"
          + "RUCTION\020\t\022\024\n\020CUSTOMER_SERVICE\020\n\022\r\n\tEDUCA"
          + "TION\020\013\022\034\n\030ENTERTAINMENT_AND_TRAVEL\020\014\022\030\n\024"
          + "FARMING_AND_OUTDOORS\020\r\022\016\n\nHEALTHCARE\020\016\022\023"
          + "\n\017HUMAN_RESOURCES\020\017\022\'\n#INSTALLATION_MAIN"
          + "TENANCE_AND_REPAIR\020\020\022\t\n\005LEGAL\020\021\022\016\n\nMANAG"
          + "EMENT\020\022\022\037\n\033MANUFACTURING_AND_WAREHOUSE\020\023"
          + "\022$\n MEDIA_COMMUNICATIONS_AND_WRITING\020\024\022\026"
          + "\n\022OIL_GAS_AND_MINING\020\025\022\036\n\032PERSONAL_CARE_"
          + "AND_SERVICES\020\026\022\027\n\023PROTECTIVE_SERVICES\020\027\022"
          + "\017\n\013REAL_ESTATE\020\030\022\036\n\032RESTAURANT_AND_HOSPI"
          + "TALITY\020\031\022\024\n\020SALES_AND_RETAIL\020\032\022\033\n\027SCIENC"
          + "E_AND_ENGINEERING\020\033\022\"\n\036SOCIAL_SERVICES_A"
          + "ND_NON_PROFIT\020\034\022!\n\035SPORTS_FITNESS_AND_RE"
          + "CREATION\020\035\022 \n\034TRANSPORTATION_AND_LOGISTI"
          + "CS\020\036*e\n\rPostingRegion\022\036\n\032POSTING_REGION_"
          + "UNSPECIFIED\020\000\022\027\n\023ADMINISTRATIVE_AREA\020\001\022\n"
          + "\n\006NATION\020\002\022\017\n\013TELECOMMUTE\020\003*j\n\nVisibilit"
          + "y\022\032\n\026VISIBILITY_UNSPECIFIED\020\000\022\020\n\014ACCOUNT"
          + "_ONLY\020\001\022\026\n\022SHARED_WITH_GOOGLE\020\002\022\026\n\022SHARE"
          + "D_WITH_PUBLIC\020\003*Z\n\020ContactInfoUsage\022\"\n\036C"
          + "ONTACT_INFO_USAGE_UNSPECIFIED\020\000\022\014\n\010PERSO"
          + "NAL\020\001\022\010\n\004WORK\020\002\022\n\n\006SCHOOL\020\003*q\n\020HtmlSanit"
          + "ization\022!\n\035HTML_SANITIZATION_UNSPECIFIED"
          + "\020\000\022\036\n\032HTML_SANITIZATION_DISABLED\020\001\022\032\n\026SI"
          + "MPLE_FORMATTING_ONLY\020\002*{\n\rCommuteMethod\022"
          + "\036\n\032COMMUTE_METHOD_UNSPECIFIED\020\000\022\013\n\007DRIVI"
          + "NG\020\001\022\013\n\007TRANSIT\020\002\022\013\n\007WALKING\020\003\022\013\n\007CYCLIN"
          + "G\020\004\022\026\n\022TRANSIT_ACCESSIBLE\020\005By\n\037com.googl"
          + "e.cloud.talent.v4beta1B\013CommonProtoP\001ZAg"
          + "oogle.golang.org/genproto/googleapis/clo"
          + "ud/talent/v4beta1;talent\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.type.LatLngProto.getDescriptor(),
          com.google.type.MoneyProto.getDescriptor(),
          com.google.type.PostalAddressProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_TimestampRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_TimestampRange_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_talent_v4beta1_Location_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_Location_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Location_descriptor,
            new java.lang.String[] {
              "LocationType", "PostalAddress", "LatLng", "RadiusMiles",
            });
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_RequestMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_RequestMetadata_descriptor,
            new java.lang.String[] {
              "Domain", "SessionId", "UserId", "AllowMissingIds", "DeviceInfo",
            });
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_ResponseMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_ResponseMetadata_descriptor,
            new java.lang.String[] {
              "RequestId",
            });
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_DeviceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_DeviceInfo_descriptor,
            new java.lang.String[] {
              "DeviceType", "Id",
            });
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CustomAttribute_descriptor,
            new java.lang.String[] {
              "StringValues", "LongValues", "Filterable",
            });
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SpellingCorrection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_SpellingCorrection_descriptor,
            new java.lang.String[] {
              "Corrected", "CorrectedText", "CorrectedHtml",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor,
            new java.lang.String[] {
              "Entries", "AnnualizedBaseCompensationRange", "AnnualizedTotalCompensationRange",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor =
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationEntry_descriptor,
            new java.lang.String[] {
              "Type",
              "Unit",
              "Amount",
              "Range",
              "Description",
              "ExpectedUnitsPerYear",
              "CompensationAmount",
            });
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor =
        internal_static_google_cloud_talent_v4beta1_CompensationInfo_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_CompensationInfo_CompensationRange_descriptor,
            new java.lang.String[] {
              "MaxCompensation", "MinCompensation",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
    com.google.type.PostalAddressProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}