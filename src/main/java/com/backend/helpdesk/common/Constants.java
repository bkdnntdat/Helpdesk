package com.backend.helpdesk.common;

public class Constants {

    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 30 * 24 * 60 * 60;
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String AUTHORITIES_KEY = "scopes";
    public static final int DAYOFFBYRULE = 15;
    public static final String PENDING = "PENDING";
    public static final String APPROVED = "APPROVED";
    public static final String REJECTED = "REJECTED";
    public static final Integer PERSONAL = 0;
    public static final String SUBJECT_DAY_OFF = "PERMISSION FORM";
    public static final String RESPONSE_DAY_OFF = "RESPONSE";

    public static String POINT_PAGE_MANAGEMENT_DAY_OFF = "https://helpdesk-owt.herokuapp.com/admin/day-offs";
    public static String POINT_CONTENT_MANAGEMENT_DAY_OFF = "=> Go to management day off page <=";

    // const sort follow skill
    public static final int SORT_BY_NAME = 1;
    public static final int SORT_BY_NAME_DESC = 2;

}