// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

public final class Enums {
  private Enums() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013enums.proto\022\016com.sts.rpclib*6\n\021RpcResp" +
      "onseStatus\022\013\n\007SUCCESS\020\000\022\t\n\005ERROR\020\001\022\t\n\005FA" +
      "TAL\020\002*\033\n\005Teams\022\010\n\004home\020\000\022\010\n\004away\020\001*\214\001\n\014J" +
      "erseyDesign\022\031\n\025UNKNOWN_JERSEY_DESIGN\020\000\022\027" +
      "\n\023SOLID_JERSEY_DESIGN\020\001\022$\n HORIZONTAL_ST" +
      "RIPES_JERSEY_DESIGN\020\002\022\"\n\036VERTICAL_STRIPE" +
      "S_JERSEY_DESIGN\020\003*\\\n\017ScoutConnection\022\034\n\030" +
      "UNKNOWN_SCOUT_CONNECTION\020\000\022\023\n\017SCOUT_CONN" +
      "ECTED\020\001\022\026\n\022SCOUT_DISCONNECTED\020\002*<\n\013Elaps" +
      "edType\022\023\n\017UNKNOWN_ELAPSED\020\000\022\013\n\007MINUTES\020\001" +
      "\022\013\n\007SECONDS\020\002*\323\003\n\tStatsType\022\020\n\014UNKNOWN_S" +
      "TAT\020\000\022\r\n\tFOUL_STAT\020\001\022\021\n\rTHROW_IN_STAT\020\002\022" +
      "\020\n\014OFFSIDE_STAT\020\003\022\023\n\017POSSESSION_STAT\020\004\022\016" +
      "\n\nCROSS_STAT\020\005\022\017\n\013CORNER_STAT\020\006\022\024\n\020YELLO" +
      "W_CARD_STAT\020\007\022\021\n\rRED_CARD_STAT\020\010\022\030\n\024YELL" +
      "OW_RED_CARD_STAT\020\t\022\020\n\014SHOT_ON_STAT\020\n\022\021\n\r" +
      "SHOT_OFF_STAT\020\013\022\022\n\016SHOT_WOOD_STAT\020\014\022\025\n\021B" +
      "LOCKED_SHOT_STAT\020\r\022\027\n\023COUNTER_ATTACK_STA" +
      "T\020\016\022\030\n\024GOALKEEPER_SAVE_STAT\020\017\022\022\n\016GOAL_KI" +
      "CK_STAT\020\020\022\022\n\016FREE_KICK_STAT\020\021\022\022\n\016TREATME" +
      "NT_STAT\020\022\022\017\n\013ATTACK_STAT\020\023\022\034\n\030DANGEROUS_" +
      "FREE_KICK_STAT\020\024\022\031\n\025DANGEROUS_ATTACK_STA" +
      "T\020\025*\320\001\n\017PitchConditions\022\034\n\030UNKNOWN_PITCH" +
      "_CONDITIONS\020\000\022\010\n\004GOOD\020\001\022\007\n\003WET\020\002\022\010\n\004SNOW" +
      "\020\003\022\r\n\tEXCELLENT\020\004\022\013\n\007REGULAR\020\005\022\014\n\010WET_FA" +
      "ST\020\006\022\022\n\016SLOW_DUE_WATER\020\007\022\n\n\006UNEVEN\020\010\022\027\n\023" +
      "GOALMOUTHS_AFFECTED\020\t\022\017\n\013HARD_FROZEN\020\n\022\016" +
      "\n\nARTIFICIAL\020\013*\323\002\n\021WeatherConditions\022\035\n\031" +
      "UNKNOWN_WEATHER_CONDITION\020\000\022\020\n\014GOOD_WEAT" +
      "HER\020\001\022\t\n\005WINDY\020\002\022\n\n\006STORMY\020\003\022\010\n\004RAIN\020\004\022\014" +
      "\n\010SNOWFALL\020\005\022\014\n\010VERY_HOT\020\006\022\016\n\nHEAVY_RAIN" +
      "\020\007\022\016\n\nLIGHT_RAIN\020\010\022\n\n\006CLOUDY\020\t\022\022\n\016HEAVY_" +
      "SNOWFALL\020\n\022\022\n\016LIGHT_SNOWFALL\020\013\022\010\n\004HAIL\020\014" +
      "\022\017\n\013STRONG_WIND\020\r\022\016\n\nLIGHT_WIND\020\016\022\007\n\003SUN" +
      "\020\017\022\007\n\003HOT\020\020\022\010\n\004MILD\020\021\022\010\n\004COLD\020\022\022\007\n\003FOG\020\023" +
      "\022\020\n\014THUNDERSTORM\020\024\022\020\n\014INDOOR_VENUE\020\025*O\n\024" +
      "AttendanceConditions\022\026\n\022UNKNOWN_ATTENDAN" +
      "CE\020\000\022\t\n\005SMALL\020\001\022\n\n\006MEDIUM\020\002\022\010\n\004FULL\020\003*\265\006" +
      "\n\tScoreType\022\021\n\rUNKNOWN_SCORE\020\000\022\021\n\rRUNNIN" +
      "G_SCORE\020\001\022\024\n\020FIRST_HALF_SCORE\020\002\022\014\n\010HT_SC" +
      "ORE\020\003\022\025\n\021SECOND_HALF_SCORE\020\004\022\014\n\010FT_SCORE" +
      "\020\005\022\032\n\026FIRST_EXTRA_TIME_SCORE\020\006\022\033\n\027SECOND" +
      "_EXTRA_TIME_SCORE\020\007\022\027\n\023HT_EXTRA_TIME_SCO" +
      "RE\020\010\022\032\n\026PENALTY_SHOOTOUT_SCORE\020\t\022\021\n\rPERI" +
      "OD1_SCORE\020\n\022\021\n\rPERIOD2_SCORE\020\013\022\021\n\rPERIOD" +
      "3_SCORE\020\014\022\022\n\016QUARTER1_SCORE\020\r\022\022\n\016QUARTER" +
      "2_SCORE\020\016\022\022\n\016QUARTER3_SCORE\020\017\022\022\n\016QUARTER" +
      "4_SCORE\020\020\022\022\n\016OVERTIME_SCORE\020\021\022\016\n\nGAME_SC" +
      "ORE\020\022\022\016\n\nSET1_SCORE\020\023\022\016\n\nSET2_SCORE\020\024\022\016\n" +
      "\nSET3_SCORE\020\025\022\016\n\nSET4_SCORE\020\026\022\016\n\nSET5_SC" +
      "ORE\020\027\022\023\n\017TIEBREAK1_SCORE\020\030\022\023\n\017TIEBREAK2_" +
      "SCORE\020\031\022\023\n\017TIEBREAK3_SCORE\020\032\022\023\n\017TIEBREAK" +
      "4_SCORE\020\033\022\023\n\017TIEBREAK5_SCORE\020\034\022\021\n\rPOINTS" +
      "1_SCORE\020\035\022\021\n\rPOINTS2_SCORE\020\036\022\017\n\013OVER1_SC" +
      "ORE\020\037\022\017\n\013OVER2_SCORE\020 \022\022\n\016WICKETS1_SCORE" +
      "\020!\022\022\n\016WICKETS2_SCORE\020\"\022\023\n\017DECLARED1_SCOR" +
      "E\020#\022\023\n\017DECLARED2_SCORE\020$\022 \n\034PENALTY_SHOO" +
      "TOUT_TOTAL_SCORE\020%\022\021\n\rINNING_SCORES\020&\022\026\n" +
      "\022EXTRA_INNING_SCORE\020\'*u\n\016CommentaryType\022" +
      "\033\n\027UNKNOWN_COMMENTARY_TYPE\020\000\022\010\n\004TIME\020\001\022\017" +
      "\n\013INJURY_TIME\020\002\022\021\n\rINCIDENT_TYPE\020\003\022\r\n\tTI" +
      "MESTAMP\020\004\022\t\n\005SCORE\020\005*\331\005\n\013MessageType\022\023\n\017" +
      "UNKNOWN_MESSAGE\020\000\022\023\n\017FULL_MATCH_DATA\020\001\022\t" +
      "\n\005STAGE\020\002\022\021\n\rMATCH_DELETED\020\003\022\016\n\nCOMMENTA" +
      "RY\020\004\022\022\n\016ADD_COMMENTARY\020\005\022\020\n\014LEAGUE_TABLE" +
      "\020\006\022\016\n\nTOP_SCORER\020\007\022\010\n\004ODDS\020\010\022\020\n\014WIDGET_E" +
      "VENT\020\t\022\026\n\022VAR_STATUS_MESSAGE\020\n\022\026\n\022VAR_RE" +
      "ASON_MESSAGE\020\013\022\027\n\023PROVIDER_CONNECTION\020\014\022" +
      "\024\n\020SCOUT_CONNECTION\020\r\022\027\n\023MATCH_STATUS_CH" +
      "ANGE\020\016\022\026\n\022MATCH_SCORE_CHANGE\020\017\022\031\n\025MATCH_" +
      "INCIDENT_CHANGE\020\020\022\027\n\023MATCH_WINNER_CHANGE" +
      "\020\021\022\034\n\030MATCH_PARTICIPANT_CHANGE\020\022\022\027\n\023MATC" +
      "H_LINEUP_CHANGE\020\023\022\026\n\022MATCH_STATS_CHANGE\020" +
      "\024\022\024\n\020DELETED_INCIDENT\020\025\022\r\n\tHEARTBEAT\020\026\022\n" +
      "\n\006STATUS\020\027\022\025\n\021LEAGUE_TABLE_FULL\020\030\022\023\n\017TOP" +
      "_SCORER_FULL\020\031\022\007\n\003H2H\020\032\022\016\n\nIMAGE_FULL\020\033\022" +
      " \n\034PARTICIPANTS_STATISTICS_FULL\020\034\022\030\n\024TEA" +
      "M_RESULTS_MATCHES\020\035\022\016\n\nMATCH_ODDS\020\036\022\r\n\tT" +
      "EAM_PAGE\020\037\022\022\n\016TEAM_PAGE_FULL\020 \022\031\n\025TEAM_F" +
      "IXTURES_MATCHES\020!\022\r\n\tDRAW_FULL\020\"*\255\010\n\023Par" +
      "ticipantPosition\022\027\n\023UNKNOWN_PERSON_TYPE\020" +
      "\000\022\016\n\nGOALKEEPER\020\001\022\014\n\010DEFENDER\020\002\022\016\n\nMIDFI" +
      "ELDER\020\003\022\013\n\007FORWARD\020\004\022\025\n\021SUBSTITUTE_PLAYE" +
      "R\020\005\022\013\n\007INJURED\020\006\022\026\n\022SUSPENDED_POSITION\020\007" +
      "\022\017\n\013UNAVAILABLE\020\010\022\t\n\005COACH\020\t\022\013\n\007PITCHER\020" +
      "\n\022\n\n\006BATTER\020\013\022\014\n\010DOUBTFUL\020\014\022\013\n\007STARTER\020\r" +
      "\022\r\n\tLEFT_BACK\020\016\022\r\n\tLEFT_WING\020\017\022\016\n\nRIGHT_" +
      "BACK\020\020\022\016\n\nRIGHT_WING\020\021\022\n\n\006CENTER\020\022\022\t\n\005PI" +
      "VOT\020\023\022\016\n\nPLAY_MAKER\020\024\022\022\n\016OFFENSIVE_LINE\020" +
      "\025\022\022\n\016DEFENSIVE_LINE\020\026\022\022\n\016OFFENSIVE_BACK\020" +
      "\027\022\022\n\016DEFENSIVE_BACK\020\030\022\020\n\014RUNNING_BACK\020\031\022" +
      "\020\n\014QUARTER_BACK\020\032\022\r\n\tSLOT_BACK\020\033\022\r\n\tHALF" +
      "_BACK\020\034\022\017\n\013LINE_BACKER\020\035\022\n\n\006KICKER\020\036\022\020\n\014" +
      "PLACE_KICKER\020\037\022\r\n\tTIGHT_END\020 \022\r\n\tSPLIT_E" +
      "ND\020!\022\t\n\005GUARD\020\"\022\022\n\016SHOOTING_GUARD\020#\022\017\n\013P" +
      "OINT_GUARD\020$\022\021\n\rSMALL_FORWARD\020%\022\021\n\rPOWER" +
      "_FORWARD\020&\022\016\n\nFIRST_BASE\020\'\022\017\n\013SECOND_BAS" +
      "E\020(\022\016\n\nTHIRD_BASE\020)\022\014\n\010OUTFIELD\020*\022\021\n\rLEF" +
      "T_OUTFIELD\020+\022\023\n\017CENTER_OUTFIELD\020,\022\022\n\016RIG" +
      "HT_OUTFIELD\020-\022\013\n\007CATCHER\020.\022\n\n\006PUNTER\020/\022\022" +
      "\n\016UTILITY_PLAYER\0200\022\014\n\010RELIEVER\0201\022\017\n\013STAR" +
      "TER_GUY\0202\022\016\n\nSHORT_STOP\0203\022\025\n\021DESIGNATED_" +
      "HITTER\0204\022\021\n\rWIDE_RECEIVER\0205\022\021\n\rCOACH_MAN" +
      "AGER\0206\022\023\n\017COACH_ASSISTANT\0207\022\023\n\017COACH_SUS" +
      "PENDED\0208\022\026\n\022NATIONAL_TEAM_DUTY\0209\022\013\n\007CAPT" +
      "AIN\020:\022\021\n\rWICKET_KEEPER\020;\022\031\n\025CAPTAIN_WICK" +
      "ET_KEEPER\020<\022\013\n\007RESERVE\020=*=\n\006Gender\022\022\n\016UN" +
      "KNOWN_GENDER\020\000\022\010\n\004MALE\020\001\022\n\n\006FEMALE\020\002\022\t\n\005" +
      "MIXED\020\003*\330\002\n\tEventType\022\021\n\rUNKNOWN_EVENT\020\000" +
      "\022\020\n\014TEAM_VS_TEAM\020\001\022\025\n\021MALE_SINGLE_MATCH\020" +
      "\002\022\025\n\021MALE_DOUBLE_MATCH\020\003\022\027\n\023FEMALE_SINGL" +
      "E_MATCH\020\004\022\027\n\023FEMALE_DOUBLE_MATCH\020\005\022\026\n\022MI" +
      "XED_DOUBLE_MATCH\020\006\022\020\n\014SINGLE_MATCH\020\007\022\020\n\014" +
      "DOUBLE_MATCH\020\010\022\022\n\016MATCH_40_OVERS\020\t\022\022\n\016MA" +
      "TCH_45_OVERS\020\n\022\022\n\016MATCH_50_OVERS\020\013\022\010\n\004T_" +
      "20\020\014\022\r\n\tT_20_INTL\020\r\022\007\n\003ODI\020\016\022\020\n\014MATCH_X_" +
      "DAYS\020\017\022\021\n\rMATCH_ONE_DAY\020\020\022\007\n\003ICC\020\021*2\n\014Up" +
      "dateAction\022\n\n\006UPDATE\020\000\022\n\n\006DELETE\020\001\022\n\n\006CR" +
      "EATE\020\002*\325\t\n\014IncidentType\022\024\n\020UNKNOWN_INCID" +
      "ENT\020\000\022\020\n\014SUBSTITUTION\020\001\022\024\n\020SUBSTITUTION_" +
      "OUT\020\002\022\023\n\017SUBSTITUTION_IN\020\003\022\020\n\014REGULAR_GO" +
      "AL\020\004\022\013\n\007PENALTY\020\005\022\022\n\016MISSED_PENALTY\020\006\022\014\n" +
      "\010OWN_GOAL\020\007\022\033\n\027SHOOTOUT_MISSED_PENALTY\020\010" +
      "\022\024\n\020SHOOTOUT_PENALTY\020\t\022\017\n\013YELLOW_CARD\020\n\022" +
      "\026\n\022SECOND_YELLOW_CARD\020\013\022\014\n\010RED_CARD\020\014\022\023\n" +
      "\017EXTRA_TIME_GOAL\020\r\022\027\n\023EXTRA_TIME_OWN_GOA" +
      "L\020\016\022\021\n\rCANCELED_GOAL\020\017\022\n\n\006ASSIST\020\020\022\021\n\rSE" +
      "COND_ASSIST\020\021\022\024\n\020CANCELED_PENALTY\020\022\022\025\n\021C" +
      "ANCELED_RED_CARD\020\023\022\030\n\024CANCELED_YELLOW_CA" +
      "RD\020\024\022\037\n\033CANCELED_SECOND_YELLOW_CARD\020\025\022\007\n" +
      "\003VAR\020\026\022\023\n\017PENALTY_AWARDED\020\027\022\017\n\013CORNER_KI" +
      "CK\020\030\022\026\n\022INCIDENT_CONFIRMED\020\031\022\026\n\022VAR_CANC" +
      "ELLED_GOAL\020\032\022\036\n\032VAR_CANCELLED_PENALTY_GO" +
      "AL\020\034\022\032\n\026TWO_MINUTES_SUSPENSION\020\035\022\033\n\027FIVE" +
      "_MINUTES_SUSPENSION\020\036\022\032\n\026TEN_MINUTES_SUS" +
      "PENSION\020\037\022\025\n\021SHORT_HANDED_GOAL\020 \022\023\n\017POWE" +
      "R_PLAY_GOAL\020!\022\014\n\010TRY_GOAL\020\"\022\023\n\017CONVERSIO" +
      "N_GOAL\020#\022\021\n\rDROPKICK_GOAL\020$\022\024\n\020PENALTY_T" +
      "RY_GOAL\020%\022\037\n\033PENALTY_TRY_CONVERSION_GOAL" +
      "\020&\022\035\n\031TWENTY_MINUTES_SUSPENSION\020\'\022\031\n\025GOL" +
      "DEN_POINT_TRY_GOAL\020(\022\035\n\031GOLDEN_POINT_PEN" +
      "ALTY_GOAL\020)\022\036\n\032GOLDEN_POINT_DROPKICK_GOA" +
      "L\020*\022\"\n\036TWENTY_FIVE_MINUTES_SUSPENSION\020+\022" +
      " \n\034TWO_MINUTES_BENCH_SUSPENSION\020,\022\025\n\021SIN" +
      "GLE_POINT_GOAL\020-\022\027\n\023EXTRA_TIME_TRY_GOAL\020" +
      ".\022\033\n\027EXTRA_TIME_PENALTY_GOAL\020/\022\036\n\032EXTRA_" +
      "TIME_CONVERSION_GOAL\0200\022\037\n\033EXTRA_TIME_PEN" +
      "ALTY_TRY_GOAL\0201\022\034\n\030EXTRA_TIME_DROPKICK_G" +
      "OAL\0202\022\'\n#DEFENSIVE_TWO_POINT_CONVERSION_" +
      "GOAL\0203*\366\003\n\006Period\022\022\n\016UNKNOWN_PERIOD\020\000\022\025\n" +
      "\021FIRST_HALF_PERIOD\020\001\022\024\n\020HALF_TIME_PERIOD" +
      "\020\002\022\026\n\022SECOND_HALF_PERIOD\020\003\022\033\n\027FIRST_EXTR" +
      "A_TIME_PERIOD\020\004\022\037\n\033EXTRA_TIME_HALF_TIME_" +
      "PERIOD\020\005\022\034\n\030SECOND_EXTRA_TIME_PERIOD\020\006\022\033" +
      "\n\027PENALTY_SHOOTOUT_PERIOD\020\007\022\020\n\014FIRST_PER" +
      "IOD\020\010\022\021\n\rSECOND_PERIOD\020\t\022\020\n\014THIRD_PERIOD" +
      "\020\n\022\030\n\024FIRST_QUARTER_PERIOD\020\013\022\031\n\025SECOND_Q" +
      "UARTER_PERIOD\020\014\022\030\n\024THIRD_QUARTER_PERIOD\020" +
      "\r\022\031\n\025FOURTH_QUARTER_PERIOD\020\016\022\023\n\017OVERTIME" +
      "_PERIOD\020\017\022\027\n\023FIRST_INNING_PERIOD\020\020\022\030\n\024SE" +
      "COND_INNING_PERIOD\020\021\022\027\n\023THIRD_INNING_PER" +
      "IOD\020\022\022\030\n\024FOURTH_INNING_PERIOD\020\023*-\n\010Cover" +
      "age\022\010\n\004LIVE\020\000\022\017\n\013RESULT_ONLY\020\001\022\006\n\002TV\020\002*\331" +
      "\001\n\022MatchOverallStatus\022\017\n\013NOT_STARTED\020\000\022\017" +
      "\n\013IN_PROGRESS\020\001\022\014\n\010FINISHED\020\002\022\014\n\010CANCELE" +
      "D\020\003\022\r\n\tPOSTPONED\020\004\022\013\n\007UNKNOWN\020\005\022\017\n\013INTER" +
      "RUPTED\020\006\022\013\n\007DELETED\020\007\022\r\n\tABANDONED\020\010\022\r\n\t" +
      "SUSPENDED\020\t\022\026\n\022COVERAGE_CANCELLED\020\n\022\025\n\021N" +
      "O_RESULT_OVERALL\020\013*\315\017\n\013MatchStatus\022\022\n\016UN" +
      "KNOWN_STATUS\020\000\022\026\n\022NOT_STARTED_STATUS\020\001\022\025" +
      "\n\021FIRST_HALF_STATUS\020\002\022\026\n\022SECOND_HALF_STA" +
      "TUS\020\003\022\033\n\027PENALTY_SHOOTOUT_STATUS\020\004\022\024\n\020PO" +
      "STPONED_STATUS\020\005\022\023\n\017FINISHED_STATUS\020\006\022!\n" +
      "\035GOLDEN_GOAL_FIRST_HALF_STATUS\020\007\022 \n\034EXTR" +
      "A_TIME_FIRST_HALF_STATUS\020\010\022!\n\035EXTRA_TIME" +
      "_SECOND_HALF_STATUS\020\t\022\024\n\020HALF_TIME_STATU" +
      "S\020\n\022$\n FINISHED_AFTER_EXTRA_TIME_STATUS\020" +
      "\013\022\026\n\022INTERRUPTED_STATUS\020\014\022#\n\037FINISHED_AF" +
      "TER_PENALTIES_STATUS\020\r\022!\n\035WAITING_FOR_EX" +
      "TRA_TIME_STATUS\020\016\022\"\n\036WAITING_FOR_GOLDEN_" +
      "GOAL_STATUS\020\017\022%\n!FINISHED_AFTER_GOLDEN_G" +
      "OAL_STATUS\020\020\022\024\n\020ABANDONED_STATUS\020\021\022\026\n\022NO" +
      "_INFO_YET_STATUS\020\022\022\"\n\036GOLDEN_GOAL_SECOND" +
      "_HALF_STATUS\020\023\022\'\n#WAITING_FOR_PENALTY_SH" +
      "OOTOUT_STATUS\020\024\022\"\n\036WAITING_FOR_SILVER_GO" +
      "AL_STATUS\020\025\022!\n\035SILVER_GOAL_FIRST_HALF_ST" +
      "ATUS\020\026\022\"\n\036SILVER_GOAL_SECOND_HALF_STATUS" +
      "\020\027\022%\n!FINISHED_AFTER_SILVER_GOAL_STATUS\020" +
      "\030\022\033\n\027KICK_OFF_DELAYED_STATUS\020\031\022\027\n\023SUDDEN" +
      "_DEATH_STATUS\020\032\022\036\n\032OVERTIME_FIRST_HALF_S" +
      "TATUS\020\033\022\037\n\033OVERTIME_SECOND_HALF_STATUS\020\034" +
      "\022\022\n\016STARTED_STATUS\020\035\022\022\n\016DELETED_STATUS\020\036" +
      "\022\023\n\017CANCELED_STATUS\020\037\022&\n\"EXTRA_TIME_FIRS" +
      "T_HALF_ENDED_STATUS\020 \022\037\n\033EXTRA_TIME_HALF" +
      "_TIME_STATUS\020!\022%\n!FINISHED_AFTER_AWARDED" +
      "_WIN_STATUS\020\"\022\017\n\013GAME_STATUS\020#\022\017\n\013SET1_S" +
      "TATUS\020$\022\017\n\013SET2_STATUS\020%\022\017\n\013SET3_STATUS\020" +
      "&\022\017\n\013SET4_STATUS\020\'\022\017\n\013SET5_STATUS\020(\022\024\n\020T" +
      "IE_BREAK_STATUS\020)\022\030\n\024FIRST_QUARTER_STATU" +
      "S\020*\022\031\n\025SECOND_QUARTER_STATUS\020+\022\030\n\024THIRD_" +
      "QUARTER_STATUS\020,\022\031\n\025FOURTH_QUARTER_STATU" +
      "S\020-\022\027\n\023FIRST_PERIOD_STATUS\020.\022\030\n\024SECOND_P" +
      "ERIOD_STATUS\020/\022\027\n\023THIRD_PERIOD_STATUS\0200\022" +
      "\027\n\023FIRST_INNING_STATUS\0201\022\030\n\024SECOND_INNIN" +
      "G_STATUS\0202\022\027\n\023THIRD_INNING_STATUS\0203\022\030\n\024F" +
      "OURTH_INNING_STATUS\0204\022\023\n\017OVERTIME_STATUS" +
      "\0205\022\024\n\020SUSPENDED_STATUS\0206\022\013\n\007DELAYED\0207\022\021\n" +
      "\rINNINGS_BREAK\0208\022\r\n\tTEA_BREAK\0209\022\t\n\005LUNCH" +
      "\020:\022\n\n\006STUMPS\020;\022\r\n\tNO_RESULT\020<\022\t\n\005PAUSE\020=" +
      "\022\024\n\020DISQUALIFICATION\020>\022\014\n\010WALKOVER\020?\022\025\n\021" +
      "SUPER_OVER_STATUS\020@\022\021\n\rDINNER_STATUS\020A\022\021" +
      "\n\rDRINKS_STATUS\020B\022\037\n\033ELECTRICAL_BREAKDOW" +
      "N_STATUS\020C\022\032\n\026STRATEGIC_BREAK_STATUS\020D\022\013" +
      "\n\007RETIRED\020E\022\033\n\027FINISHED_AFTER_OVERTIME\020F" +
      "\022\027\n\023FIFTH_INNING_STATUS\020G\022\027\n\023SIXTH_INNIN" +
      "G_STATUS\020H\022\031\n\025SEVENTH_INNING_STATUS\020I\022\030\n" +
      "\024EIGHTH_INNING_STATUS\020J\022\027\n\023NINTH_INNING_" +
      "STATUS\020K\022\027\n\023TENTH_INNING_STATUS\020L\022\027\n\023EXT" +
      "RA_INNING_STATUS\020M*\200\001\n\017ParticipantKind\022\020" +
      "\n\014UNKNOWN_KIND\020\000\022\010\n\004TEAM\020\001\022\013\n\007ATHLETE\020\002\022" +
      "\020\n\014ORGANISATION\020\003\022\016\n\nCOACH_KIND\020\004\022\013\n\007REF" +
      "EREE\020\005\022\025\n\021REFEREE_ASSISTANT\020\006*G\n\022Provide" +
      "rConnection\022\026\n\022PROVIDER_CONNECTED\020\000\022\031\n\025P" +
      "ROVIDER_DISCONNECTED\020\001*\206\n\n\017WidgetEventTy" +
      "pe\022\030\n\024UNKNOWN_WIDGET_EVENT\020\000\022\026\n\022PLAYERS_" +
      "COMING_OUT\020\001\022\024\n\020PLAYERS_LINED_UP\020\002\022\033\n\027NA" +
      "TIONAL_ANTHEM_SINGING\020\003\022\017\n\013SHAKE_HANDS\020\004" +
      "\022\r\n\tFLIP_COIN\020\005\022\022\n\016MINUTE_SILENCE\020\006\022\031\n\025P" +
      "RICE_GIVING_CEREMONY\020\007\022\020\n\014PHOTO_TAKING\020\010" +
      "\022\022\n\016JERSEY_CHANGED\020\t\022\025\n\021FORMATION_CHANGE" +
      "D\020\n\022\027\n\023GAME_ABOUT_TO_START\020\013\022\020\n\014RESTART_" +
      "GAME\020\014\022\020\n\014INJURY_BREAK\020\r\022\027\n\023PLAYER_INJUR" +
      "ED_AWAY\020\016\022\027\n\023PLAYER_INJURED_HOME\020\017\022\025\n\021NE" +
      "XT_PENALTY_HOME\020\020\022\025\n\021NEXT_PENALTY_AWAY\020\021" +
      "\022\027\n\023NEXT_PENALTY_SCORER\020\022\022\020\n\014REFEREE_BAL" +
      "L\020\023\022\017\n\013ATTACK_HOME\020\024\022\017\n\013ATTACK_AWAY\020\025\022\n\n" +
      "\006DANGER\020\026\022\017\n\013DANGER_AWAY\020\027\022\017\n\013DANGER_HOM" +
      "E\020\030\022\031\n\025DANGEROUS_ATTACK_AWAY\020\031\022\031\n\025DANGER" +
      "OUS_ATTACK_HOME\020\032\022\034\n\030DANGEROUS_FREE_KICK" +
      "_AWAY\020\033\022\034\n\030DANGEROUS_FREE_KICK_HOME\020\034\022\010\n" +
      "\004SAFE\020\035\022\r\n\tSAFE_AWAY\020\036\022\r\n\tSAFE_HOME\020\037\022\027\n" +
      "\023SHOT_ON_TARGET_AWAY\020 \022\027\n\023SHOT_ON_TARGET" +
      "_HOME\020!\022\030\n\024SHOT_OFF_TARGET_AWAY\020\"\022\030\n\024SHO" +
      "T_OFF_TARGET_HOME\020#\022\026\n\022SHOT_WOODWORK_AWA" +
      "Y\020$\022\026\n\022SHOT_WOODWORK_HOME\020%\022\025\n\021SHOT_BLOC" +
      "KED_AWAY\020&\022\025\n\021SHOT_BLOCKED_HOME\020\'\022\021\n\rTHR" +
      "OW_IN_AWAY\020(\022\021\n\rTHROW_IN_HOME\020)\022\022\n\016FREE_" +
      "KICK_AWAY\020*\022\022\n\016FREE_KICK_HOME\020+\022\r\n\tFOUL_" +
      "AWAY\020,\022\r\n\tFOUL_HOME\020-\022\020\n\014OFFSIDE_AWAY\020.\022" +
      "\020\n\014OFFSIDE_HOME\020/\022\021\n\rKICK_OFF_AWAY\0200\022\021\n\r" +
      "KICK_OFF_HOME\0201\022\022\n\016GOAL_KICK_AWAY\0202\022\022\n\016G" +
      "OAL_KICK_HOME\0203\022\022\n\016BREAKAWAY_AWAY\0204\022\022\n\016B" +
      "REAKAWAY_HOME\0205\022\021\n\rBALL_POSITION\0206\022\020\n\014NO" +
      "_FREE_KICK\0207\022\017\n\013NO_THROW_IN\0208\022\017\n\013CORNER_" +
      "HOME\0209\022\017\n\013CORNER_AWAY\020:\022\026\n\022CANCEL_CORNER" +
      "_HOME\020;\022\026\n\022CANCEL_CORNER_AWAY\020<*\233\003\n\tPitc" +
      "hZone\022\026\n\022UNKNOWN_PITCH_ZONE\020\000\022\024\n\020CORNER_" +
      "HOME_LEFT\020\001\022\025\n\021CORNER_HOME_RIGHT\020\002\022\024\n\020CO" +
      "RNER_AWAY_LEFT\020\003\022\025\n\021CORNER_AWAY_RIGHT\020\004\022" +
      "\024\n\020FREE_KICK_HOME_1\020\005\022\024\n\020FREE_KICK_HOME_" +
      "2\020\006\022\031\n\025FREE_KICK_HOME_3_LEFT\020\007\022\032\n\026FREE_K" +
      "ICK_HOME_3_RIGHT\020\010\022\024\n\020FREE_KICK_HOME_4\020\t" +
      "\022\024\n\020FREE_KICK_HOME_5\020\n\022\024\n\020FREE_KICK_AWAY" +
      "_1\020\013\022\024\n\020FREE_KICK_AWAY_2\020\014\022\031\n\025FREE_KICK_" +
      "AWAY_3_LEFT\020\r\022\032\n\026FREE_KICK_AWAY_3_RIGHT\020" +
      "\016\022\024\n\020FREE_KICK_AWAY_4\020\017\022\024\n\020FREE_KICK_AWA" +
      "Y_5\020\020*A\n\tVarStatus\022\017\n\013VAR_STARTED\020\000\022\020\n\014V" +
      "AR_FINISHED\020\001\022\021\n\rVAR_CANCELLED\020\002*f\n\tVarR" +
      "eason\022\026\n\022VAR_REASON_UNKNOWN\020\000\022\023\n\017VAR_REA" +
      "SON_GOAL\020\001\022\026\n\022VAR_REASON_PENALTY\020\002\022\024\n\020VA" +
      "R_REASON_CARDS\020\003*\260\030\n\013StagePhases\022\027\n\023STAG" +
      "E_PHASE_UNKNOWN\020\000\022\r\n\tPROMOTION\020\001\022\016\n\nRELE" +
      "GATION\020\002\022\024\n\020CHAMPIONS_LEAGUE\020\003\022\"\n\036CHAMPI" +
      "ONS_LEAGUE_QUALIFICATION\020\004\022\014\n\010PLAY_OFF\020\005" +
      "\022\027\n\023RELEGATION_PLAY_OFF\020\006\022\026\n\022PROMOTION_P" +
      "LAY_OFF\020\007\022\021\n\rEUROPA_LEAGUE\020\010\022\037\n\033EUROPA_L" +
      "EAGUE_QUALIFICATION\020\t\022\037\n\033QUALIFICATION_T" +
      "O_NEXT_STAGE\020\n\022(\n$POSSIBLE_QUALIFICATION" +
      "_TO_NEXT_STAGE\020\013\022\031\n\025CHAMPIONSHIP_PLAY_OF" +
      "F\020\014\022&\n\"CAF_CHAMPIONS_LEAGUE_QUALIFICATIO" +
      "N\020\r\022\'\n#CAF_CONFEDERATION_CUP_QUALIFICATI" +
      "ON\020\016\022\030\n\024AFC_CHAMPIONS_LEAGUE\020\017\022&\n\"AFC_CH" +
      "AMPIONS_LEAGUE_QUALIFICATION\020\020\022\031\n\025AFC_CU" +
      "P_QUALIFICATION\020\021\022\026\n\022AFC_PRESIDENTS_CUP\020" +
      "\022\022\025\n\021COPA_LIBERTADORES\020\023\022#\n\037COPA_LIBERTA" +
      "DORES_QUALIFICATION\020\024\022\025\n\021COPA_SUDAMERICA" +
      "NA\020\025\022\030\n\024OFC_CHAMPIONS_LEAGUE\020\026\022&\n\"OFC_CH" +
      "AMPIONS_LEAGUE_QUALIFICATION\020\027\022\035\n\031CONCAC" +
      "AF_CHAMPIONS_LEAGUE\020\030\022\031\n\025CFU_CLUB_CHAMPI" +
      "ONSHIP\020\031\022\013\n\007AFC_CUP\020\032\022\026\n\022POSSIBLE_ASIAN_" +
      "CUP\020\033\022\r\n\tASIAN_CUP\020\034\022\036\n\032FA_CUP_GIVES_EUR" +
      "OPA_LEAGUE\020\035\022,\n(FA_CUP_GIVES_EUROPA_LEAG" +
      "UE_QUALIFICATION\020\036\0224\n0FA_CUP_GIVES_CAF_C" +
      "ONFEDERATION_CUP_QUALIFICATION\020\037\022%\n!FA_C" +
      "UP_GIVES_AFC_CHAMPIONS_LEAGUE\020 \022&\n\"FA_CU" +
      "P_GIVES_AFC_CUP_QUALIFICATION\020!\022\"\n\036FA_CU" +
      "P_GIVES_COPA_LIBERTADORES\020\"\022\"\n\036FA_CUP_GI" +
      "VES_COPA_SUDAMERICANA\020#\0223\n/FA_CUP_GIVES_" +
      "AFC_CHAMPIONS_LEAGUE_QUALIFICATION\020%\022\030\n\024" +
      "FA_CUP_GIVES_AFC_CUP\020&\022*\n&FA_CUP_GIVES_C" +
      "ONCACAF_CHAMPIONS_LEAGUE\020\'\022)\n%FA_CUP_GIV" +
      "ES_EXTRA_EUROPA_LEAGUE_SPOT\020(\0227\n3FA_CUP_" +
      "GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_" +
      "SPOT\020)\0220\n,FA_CUP_GIVES_COPA_LIBERTADORES" +
      "_QUALIFICATION\020*\022B\n>CHAMPIONSHIP_PLAY_OF" +
      "F_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATI" +
      "ON\020+\0224\n0CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_" +
      "CHAMPIONS_LEAGUE\020,\0220\n,CHAMPIONSHIP_PLAY_" +
      "OFF_GIVES_CHAMPIONS_LEAGUE\020-\0224\n0CHAMPION" +
      "SHIP_PLAY_OFF_GIVES_LEAGUE_QUALIFICATION" +
      "\020.\022-\n)CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA" +
      "_LEAGUE\020/\022;\n7CHAMPIONSHIP_PLAY_OFF_GIVES" +
      "_EUROPA_LEAGUE_QUALIFICATION\0200\022B\n>CHAMPI" +
      "ONSHIP_PLAY_OFF_GIVES_CAF_CHAMPIONS_LEAG" +
      "UE_QUALIFICATION\0201\022C\n?CHAMPIONSHIP_PLAY_" +
      "OFF_GIVES_CAF_CONFEDERATION_CUP_QUALIFIC" +
      "ATION\0202\022\'\n#CHAMPIONSHIP_PLAY_OFF_GIVES_A" +
      "FC_CUP\0203\0225\n1CHAMPIONSHIP_PLAY_OFF_GIVES_" +
      "AFC_CUP_QUALIFICATION\0204\0222\n.CHAMPIONSHIP_" +
      "PLAY_OFF_GIVES_AFC_PRESIDENTS_CUP\0205\0224\n0C" +
      "HAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS" +
      "_LEAGUE\0206\022B\n>CHAMPIONSHIP_PLAY_OFF_GIVES" +
      "_OFC_CHAMPIONS_LEAGUE_QUALIFICATION\0207\0229\n" +
      "5CHAMPIONSHIP_PLAY_OFF_GIVES_CONCACAF_CH" +
      "AMPIONS_LEAGUE\0208\0225\n1CHAMPIONSHIP_PLAY_OF" +
      "F_GIVES_CFU_CLUB_CHAMPIONSHIP\0209\0221\n-CHAMP" +
      "IONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES" +
      "\020:\022?\n;CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_L" +
      "IBERTADORES_QUALIFICATION\020;\0221\n-CHAMPIONS" +
      "HIP_PLAY_OFF_GIVES_COPA_SUDAMERICANA\020<\022>" +
      "\n:CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_" +
      "LEAGUE_QUALIFICATION\020=\0220\n,LEAGUE_CUP_GIV" +
      "ES_EUROPA_LEAGUE_QUALIFICATION\020>\022B\n>LEAG" +
      "UE_CUP_WINNER_GIVES_EXTRA_EUROPA_LEAGUE_" +
      "QUALIFICATION_SPOT\020?\0225\n1COPA_LIBERTADORE" +
      "S_PLAYOFF_GIVES_COPA_SUDAMERICANA\020@\0226\n2C" +
      "OPA_LIBERTADORES_PLAYOFF_GIVES_COPPA_LIB" +
      "ERTADORES\020A\022:\n6FINAL_LEAGUE_PLAYOFF_GIVE" +
      "S_EUROPA_LEAGUE_QUALIFICATION\020B\0227\n3FA_CU" +
      "P_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFI" +
      "CATION\020C\022*\n&EUROPA_CONFERENCE_LEAGUE_QUA" +
      "LIFICATION\020D\022\034\n\030EUROPA_CONFERENCE_LEAGUE" +
      "\020E\022F\nBCHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA" +
      "_CONFERENCE_LEAGUE_QUALIFICATION\020F\022;\n7LE" +
      "AGUE_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_" +
      "QUALIFICATION\020G\022\r\n\tWORLD_CUP\020H\022\"\n\036POSSIB" +
      "LE_CHAMPIONSHIP_PLAY_OFF\020I\022#\n\037QUALIFICAT" +
      "ION_TO_QUARTER_FINALS\020J\022\"\n\036QUALIFICATION" +
      "_TO_EIGHTH_FINALS\020K*\346\003\n\tRoundType\022\021\n\rUNK" +
      "NOWN_ROUND\020\000\022\014\n\010NO_ROUND\020\001\022\017\n\013SEMI_FINAL" +
      "S\020\002\022\022\n\016QUARTER_FINALS\020\003\022\010\n\004_1_8\020\004\022\t\n\005_1_" +
      "16\020\005\022\t\n\005_1_32\020\006\022\t\n\005_1_64\020\007\022\n\n\006_1_128\020\010\022\t" +
      "\n\005FINAL\020\t\022\t\n\005_1_96\020\n\022\t\n\005_1_48\020\013\022\t\n\005_1_24" +
      "\020\014\022\t\n\005_1_12\020\r\022\010\n\004_1_6\020\016\022\010\n\004_1_3\020\017\022\t\n\005_1_" +
      "28\020\020\022\t\n\005_1_14\020\021\022\010\n\004_1_7\020\022\022\017\n\013SMALL_FINAL" +
      "\020\023\022\n\n\006_1_256\020\024\022\n\n\006_1_512\020\025\022\010\n\004_5_6\020\026\022\010\n\004" +
      "_7_8\020\027\022\t\n\005_9_10\020\030\022\n\n\006_11_12\020\031\022\010\n\004_5_8\020\032\022" +
      "\n\n\006_17_20\020\033\022\n\n\006_21_24\020\034\022\n\n\006_17_18\020\035\022\n\n\006_" +
      "19_20\020\036\022\n\n\006_21_22\020\037\022\n\n\006_23_24\020 \022\n\n\006_12_1" +
      "3\020!\022\n\n\006_11_14\020\"\022\t\n\005TITLE\020#\022\027\n\023THIRD_PLAC" +
      "E_PLAYOFF\020$\022\017\n\013ROUND_ROBIN\020%B\rP\001Z\t/gorpc" +
      "libb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
