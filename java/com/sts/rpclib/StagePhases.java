// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: enums.proto

package com.sts.rpclib;

/**
 * Protobuf enum {@code com.sts.rpclib.StagePhases}
 */
public enum StagePhases
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STAGE_PHASE_UNKNOWN = 0;</code>
   */
  STAGE_PHASE_UNKNOWN(0),
  /**
   * <code>PROMOTION = 1;</code>
   */
  PROMOTION(1),
  /**
   * <code>RELEGATION = 2;</code>
   */
  RELEGATION(2),
  /**
   * <code>CHAMPIONS_LEAGUE = 3;</code>
   */
  CHAMPIONS_LEAGUE(3),
  /**
   * <code>CHAMPIONS_LEAGUE_QUALIFICATION = 4;</code>
   */
  CHAMPIONS_LEAGUE_QUALIFICATION(4),
  /**
   * <code>PLAY_OFF = 5;</code>
   */
  PLAY_OFF(5),
  /**
   * <code>RELEGATION_PLAY_OFF = 6;</code>
   */
  RELEGATION_PLAY_OFF(6),
  /**
   * <code>PROMOTION_PLAY_OFF = 7;</code>
   */
  PROMOTION_PLAY_OFF(7),
  /**
   * <code>EUROPA_LEAGUE = 8;</code>
   */
  EUROPA_LEAGUE(8),
  /**
   * <code>EUROPA_LEAGUE_QUALIFICATION = 9;</code>
   */
  EUROPA_LEAGUE_QUALIFICATION(9),
  /**
   * <code>QUALIFICATION_TO_NEXT_STAGE = 10;</code>
   */
  QUALIFICATION_TO_NEXT_STAGE(10),
  /**
   * <code>POSSIBLE_QUALIFICATION_TO_NEXT_STAGE = 11;</code>
   */
  POSSIBLE_QUALIFICATION_TO_NEXT_STAGE(11),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF = 12;</code>
   */
  CHAMPIONSHIP_PLAY_OFF(12),
  /**
   * <code>CAF_CHAMPIONS_LEAGUE_QUALIFICATION = 13;</code>
   */
  CAF_CHAMPIONS_LEAGUE_QUALIFICATION(13),
  /**
   * <code>CAF_CONFEDERATION_CUP_QUALIFICATION = 14;</code>
   */
  CAF_CONFEDERATION_CUP_QUALIFICATION(14),
  /**
   * <code>AFC_CHAMPIONS_LEAGUE = 15;</code>
   */
  AFC_CHAMPIONS_LEAGUE(15),
  /**
   * <code>AFC_CHAMPIONS_LEAGUE_QUALIFICATION = 16;</code>
   */
  AFC_CHAMPIONS_LEAGUE_QUALIFICATION(16),
  /**
   * <code>AFC_CUP_QUALIFICATION = 17;</code>
   */
  AFC_CUP_QUALIFICATION(17),
  /**
   * <code>AFC_PRESIDENTS_CUP = 18;</code>
   */
  AFC_PRESIDENTS_CUP(18),
  /**
   * <code>COPA_LIBERTADORES = 19;</code>
   */
  COPA_LIBERTADORES(19),
  /**
   * <code>COPA_LIBERTADORES_QUALIFICATION = 20;</code>
   */
  COPA_LIBERTADORES_QUALIFICATION(20),
  /**
   * <code>COPA_SUDAMERICANA = 21;</code>
   */
  COPA_SUDAMERICANA(21),
  /**
   * <code>OFC_CHAMPIONS_LEAGUE = 22;</code>
   */
  OFC_CHAMPIONS_LEAGUE(22),
  /**
   * <code>OFC_CHAMPIONS_LEAGUE_QUALIFICATION = 23;</code>
   */
  OFC_CHAMPIONS_LEAGUE_QUALIFICATION(23),
  /**
   * <code>CONCACAF_CHAMPIONS_LEAGUE = 24;</code>
   */
  CONCACAF_CHAMPIONS_LEAGUE(24),
  /**
   * <code>CFU_CLUB_CHAMPIONSHIP = 25;</code>
   */
  CFU_CLUB_CHAMPIONSHIP(25),
  /**
   * <code>AFC_CUP = 26;</code>
   */
  AFC_CUP(26),
  /**
   * <code>POSSIBLE_ASIAN_CUP = 27;</code>
   */
  POSSIBLE_ASIAN_CUP(27),
  /**
   * <code>ASIAN_CUP = 28;</code>
   */
  ASIAN_CUP(28),
  /**
   * <code>FA_CUP_GIVES_EUROPA_LEAGUE = 29;</code>
   */
  FA_CUP_GIVES_EUROPA_LEAGUE(29),
  /**
   * <code>FA_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION = 30;</code>
   */
  FA_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION(30),
  /**
   * <code>FA_CUP_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION = 31;</code>
   */
  FA_CUP_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION(31),
  /**
   * <code>FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE = 32;</code>
   */
  FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE(32),
  /**
   * <code>FA_CUP_GIVES_AFC_CUP_QUALIFICATION = 33;</code>
   */
  FA_CUP_GIVES_AFC_CUP_QUALIFICATION(33),
  /**
   * <code>FA_CUP_GIVES_COPA_LIBERTADORES = 34;</code>
   */
  FA_CUP_GIVES_COPA_LIBERTADORES(34),
  /**
   * <code>FA_CUP_GIVES_COPA_SUDAMERICANA = 35;</code>
   */
  FA_CUP_GIVES_COPA_SUDAMERICANA(35),
  /**
   * <code>FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION = 37;</code>
   */
  FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION(37),
  /**
   * <code>FA_CUP_GIVES_AFC_CUP = 38;</code>
   */
  FA_CUP_GIVES_AFC_CUP(38),
  /**
   * <code>FA_CUP_GIVES_CONCACAF_CHAMPIONS_LEAGUE = 39;</code>
   */
  FA_CUP_GIVES_CONCACAF_CHAMPIONS_LEAGUE(39),
  /**
   * <code>FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_SPOT = 40;</code>
   */
  FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_SPOT(40),
  /**
   * <code>FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT = 41;</code>
   */
  FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT(41),
  /**
   * <code>FA_CUP_GIVES_COPA_LIBERTADORES_QUALIFICATION = 42;</code>
   */
  FA_CUP_GIVES_COPA_LIBERTADORES_QUALIFICATION(42),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION = 43;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION(43),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE = 44;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE(44),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE = 45;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE(45),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_LEAGUE_QUALIFICATION = 46;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_LEAGUE_QUALIFICATION(46),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE = 47;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE(47),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE_QUALIFICATION = 48;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE_QUALIFICATION(48),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CHAMPIONS_LEAGUE_QUALIFICATION = 49;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CHAMPIONS_LEAGUE_QUALIFICATION(49),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION = 50;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION(50),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP = 51;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP(51),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP_QUALIFICATION = 52;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP_QUALIFICATION(52),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_PRESIDENTS_CUP = 53;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_PRESIDENTS_CUP(53),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE = 54;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE(54),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE_QUALIFICATION = 55;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE_QUALIFICATION(55),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CONCACAF_CHAMPIONS_LEAGUE = 56;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_CONCACAF_CHAMPIONS_LEAGUE(56),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CFU_CLUB_CHAMPIONSHIP = 57;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_CFU_CLUB_CHAMPIONSHIP(57),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES = 58;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES(58),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES_QUALIFICATION = 59;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES_QUALIFICATION(59),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_SUDAMERICANA = 60;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_SUDAMERICANA(60),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE_QUALIFICATION = 61;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE_QUALIFICATION(61),
  /**
   * <code>LEAGUE_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION = 62;</code>
   */
  LEAGUE_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION(62),
  /**
   * <code>LEAGUE_CUP_WINNER_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT = 63;</code>
   */
  LEAGUE_CUP_WINNER_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT(63),
  /**
   * <code>COPA_LIBERTADORES_PLAYOFF_GIVES_COPA_SUDAMERICANA = 64;</code>
   */
  COPA_LIBERTADORES_PLAYOFF_GIVES_COPA_SUDAMERICANA(64),
  /**
   * <code>COPA_LIBERTADORES_PLAYOFF_GIVES_COPPA_LIBERTADORES = 65;</code>
   */
  COPA_LIBERTADORES_PLAYOFF_GIVES_COPPA_LIBERTADORES(65),
  /**
   * <code>FINAL_LEAGUE_PLAYOFF_GIVES_EUROPA_LEAGUE_QUALIFICATION = 66;</code>
   */
  FINAL_LEAGUE_PLAYOFF_GIVES_EUROPA_LEAGUE_QUALIFICATION(66),
  /**
   * <code>FA_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 67;</code>
   */
  FA_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION(67),
  /**
   * <code>EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 68;</code>
   */
  EUROPA_CONFERENCE_LEAGUE_QUALIFICATION(68),
  /**
   * <code>EUROPA_CONFERENCE_LEAGUE = 69;</code>
   */
  EUROPA_CONFERENCE_LEAGUE(69),
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 70;</code>
   */
  CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION(70),
  /**
   * <code>LEAGUE_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 71;</code>
   */
  LEAGUE_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION(71),
  /**
   * <code>WORLD_CUP = 72;</code>
   */
  WORLD_CUP(72),
  /**
   * <code>POSSIBLE_CHAMPIONSHIP_PLAY_OFF = 73;</code>
   */
  POSSIBLE_CHAMPIONSHIP_PLAY_OFF(73),
  /**
   * <code>QUALIFICATION_TO_QUARTER_FINALS = 74;</code>
   */
  QUALIFICATION_TO_QUARTER_FINALS(74),
  /**
   * <code>QUALIFICATION_TO_EIGHTH_FINALS = 75;</code>
   */
  QUALIFICATION_TO_EIGHTH_FINALS(75),
  /**
   * <code>DIVISION_CHAMPIONSHIP_PLAYOFF = 76;</code>
   */
  DIVISION_CHAMPIONSHIP_PLAYOFF(76),
  /**
   * <code>CONFERENCE_CHAMPIONSHIP_PLAYOFF = 77;</code>
   */
  CONFERENCE_CHAMPIONSHIP_PLAYOFF(77),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STAGE_PHASE_UNKNOWN = 0;</code>
   */
  public static final int STAGE_PHASE_UNKNOWN_VALUE = 0;
  /**
   * <code>PROMOTION = 1;</code>
   */
  public static final int PROMOTION_VALUE = 1;
  /**
   * <code>RELEGATION = 2;</code>
   */
  public static final int RELEGATION_VALUE = 2;
  /**
   * <code>CHAMPIONS_LEAGUE = 3;</code>
   */
  public static final int CHAMPIONS_LEAGUE_VALUE = 3;
  /**
   * <code>CHAMPIONS_LEAGUE_QUALIFICATION = 4;</code>
   */
  public static final int CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 4;
  /**
   * <code>PLAY_OFF = 5;</code>
   */
  public static final int PLAY_OFF_VALUE = 5;
  /**
   * <code>RELEGATION_PLAY_OFF = 6;</code>
   */
  public static final int RELEGATION_PLAY_OFF_VALUE = 6;
  /**
   * <code>PROMOTION_PLAY_OFF = 7;</code>
   */
  public static final int PROMOTION_PLAY_OFF_VALUE = 7;
  /**
   * <code>EUROPA_LEAGUE = 8;</code>
   */
  public static final int EUROPA_LEAGUE_VALUE = 8;
  /**
   * <code>EUROPA_LEAGUE_QUALIFICATION = 9;</code>
   */
  public static final int EUROPA_LEAGUE_QUALIFICATION_VALUE = 9;
  /**
   * <code>QUALIFICATION_TO_NEXT_STAGE = 10;</code>
   */
  public static final int QUALIFICATION_TO_NEXT_STAGE_VALUE = 10;
  /**
   * <code>POSSIBLE_QUALIFICATION_TO_NEXT_STAGE = 11;</code>
   */
  public static final int POSSIBLE_QUALIFICATION_TO_NEXT_STAGE_VALUE = 11;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF = 12;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_VALUE = 12;
  /**
   * <code>CAF_CHAMPIONS_LEAGUE_QUALIFICATION = 13;</code>
   */
  public static final int CAF_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 13;
  /**
   * <code>CAF_CONFEDERATION_CUP_QUALIFICATION = 14;</code>
   */
  public static final int CAF_CONFEDERATION_CUP_QUALIFICATION_VALUE = 14;
  /**
   * <code>AFC_CHAMPIONS_LEAGUE = 15;</code>
   */
  public static final int AFC_CHAMPIONS_LEAGUE_VALUE = 15;
  /**
   * <code>AFC_CHAMPIONS_LEAGUE_QUALIFICATION = 16;</code>
   */
  public static final int AFC_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 16;
  /**
   * <code>AFC_CUP_QUALIFICATION = 17;</code>
   */
  public static final int AFC_CUP_QUALIFICATION_VALUE = 17;
  /**
   * <code>AFC_PRESIDENTS_CUP = 18;</code>
   */
  public static final int AFC_PRESIDENTS_CUP_VALUE = 18;
  /**
   * <code>COPA_LIBERTADORES = 19;</code>
   */
  public static final int COPA_LIBERTADORES_VALUE = 19;
  /**
   * <code>COPA_LIBERTADORES_QUALIFICATION = 20;</code>
   */
  public static final int COPA_LIBERTADORES_QUALIFICATION_VALUE = 20;
  /**
   * <code>COPA_SUDAMERICANA = 21;</code>
   */
  public static final int COPA_SUDAMERICANA_VALUE = 21;
  /**
   * <code>OFC_CHAMPIONS_LEAGUE = 22;</code>
   */
  public static final int OFC_CHAMPIONS_LEAGUE_VALUE = 22;
  /**
   * <code>OFC_CHAMPIONS_LEAGUE_QUALIFICATION = 23;</code>
   */
  public static final int OFC_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 23;
  /**
   * <code>CONCACAF_CHAMPIONS_LEAGUE = 24;</code>
   */
  public static final int CONCACAF_CHAMPIONS_LEAGUE_VALUE = 24;
  /**
   * <code>CFU_CLUB_CHAMPIONSHIP = 25;</code>
   */
  public static final int CFU_CLUB_CHAMPIONSHIP_VALUE = 25;
  /**
   * <code>AFC_CUP = 26;</code>
   */
  public static final int AFC_CUP_VALUE = 26;
  /**
   * <code>POSSIBLE_ASIAN_CUP = 27;</code>
   */
  public static final int POSSIBLE_ASIAN_CUP_VALUE = 27;
  /**
   * <code>ASIAN_CUP = 28;</code>
   */
  public static final int ASIAN_CUP_VALUE = 28;
  /**
   * <code>FA_CUP_GIVES_EUROPA_LEAGUE = 29;</code>
   */
  public static final int FA_CUP_GIVES_EUROPA_LEAGUE_VALUE = 29;
  /**
   * <code>FA_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION = 30;</code>
   */
  public static final int FA_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION_VALUE = 30;
  /**
   * <code>FA_CUP_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION = 31;</code>
   */
  public static final int FA_CUP_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION_VALUE = 31;
  /**
   * <code>FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE = 32;</code>
   */
  public static final int FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE_VALUE = 32;
  /**
   * <code>FA_CUP_GIVES_AFC_CUP_QUALIFICATION = 33;</code>
   */
  public static final int FA_CUP_GIVES_AFC_CUP_QUALIFICATION_VALUE = 33;
  /**
   * <code>FA_CUP_GIVES_COPA_LIBERTADORES = 34;</code>
   */
  public static final int FA_CUP_GIVES_COPA_LIBERTADORES_VALUE = 34;
  /**
   * <code>FA_CUP_GIVES_COPA_SUDAMERICANA = 35;</code>
   */
  public static final int FA_CUP_GIVES_COPA_SUDAMERICANA_VALUE = 35;
  /**
   * <code>FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION = 37;</code>
   */
  public static final int FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 37;
  /**
   * <code>FA_CUP_GIVES_AFC_CUP = 38;</code>
   */
  public static final int FA_CUP_GIVES_AFC_CUP_VALUE = 38;
  /**
   * <code>FA_CUP_GIVES_CONCACAF_CHAMPIONS_LEAGUE = 39;</code>
   */
  public static final int FA_CUP_GIVES_CONCACAF_CHAMPIONS_LEAGUE_VALUE = 39;
  /**
   * <code>FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_SPOT = 40;</code>
   */
  public static final int FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_SPOT_VALUE = 40;
  /**
   * <code>FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT = 41;</code>
   */
  public static final int FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT_VALUE = 41;
  /**
   * <code>FA_CUP_GIVES_COPA_LIBERTADORES_QUALIFICATION = 42;</code>
   */
  public static final int FA_CUP_GIVES_COPA_LIBERTADORES_QUALIFICATION_VALUE = 42;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION = 43;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 43;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE = 44;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE_VALUE = 44;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE = 45;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE_VALUE = 45;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_LEAGUE_QUALIFICATION = 46;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_LEAGUE_QUALIFICATION_VALUE = 46;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE = 47;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE_VALUE = 47;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE_QUALIFICATION = 48;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE_QUALIFICATION_VALUE = 48;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CHAMPIONS_LEAGUE_QUALIFICATION = 49;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 49;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION = 50;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION_VALUE = 50;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP = 51;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP_VALUE = 51;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP_QUALIFICATION = 52;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP_QUALIFICATION_VALUE = 52;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_PRESIDENTS_CUP = 53;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_PRESIDENTS_CUP_VALUE = 53;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE = 54;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE_VALUE = 54;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE_QUALIFICATION = 55;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 55;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CONCACAF_CHAMPIONS_LEAGUE = 56;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_CONCACAF_CHAMPIONS_LEAGUE_VALUE = 56;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CFU_CLUB_CHAMPIONSHIP = 57;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_CFU_CLUB_CHAMPIONSHIP_VALUE = 57;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES = 58;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES_VALUE = 58;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES_QUALIFICATION = 59;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES_QUALIFICATION_VALUE = 59;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_SUDAMERICANA = 60;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_SUDAMERICANA_VALUE = 60;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE_QUALIFICATION = 61;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE_QUALIFICATION_VALUE = 61;
  /**
   * <code>LEAGUE_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION = 62;</code>
   */
  public static final int LEAGUE_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION_VALUE = 62;
  /**
   * <code>LEAGUE_CUP_WINNER_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT = 63;</code>
   */
  public static final int LEAGUE_CUP_WINNER_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT_VALUE = 63;
  /**
   * <code>COPA_LIBERTADORES_PLAYOFF_GIVES_COPA_SUDAMERICANA = 64;</code>
   */
  public static final int COPA_LIBERTADORES_PLAYOFF_GIVES_COPA_SUDAMERICANA_VALUE = 64;
  /**
   * <code>COPA_LIBERTADORES_PLAYOFF_GIVES_COPPA_LIBERTADORES = 65;</code>
   */
  public static final int COPA_LIBERTADORES_PLAYOFF_GIVES_COPPA_LIBERTADORES_VALUE = 65;
  /**
   * <code>FINAL_LEAGUE_PLAYOFF_GIVES_EUROPA_LEAGUE_QUALIFICATION = 66;</code>
   */
  public static final int FINAL_LEAGUE_PLAYOFF_GIVES_EUROPA_LEAGUE_QUALIFICATION_VALUE = 66;
  /**
   * <code>FA_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 67;</code>
   */
  public static final int FA_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION_VALUE = 67;
  /**
   * <code>EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 68;</code>
   */
  public static final int EUROPA_CONFERENCE_LEAGUE_QUALIFICATION_VALUE = 68;
  /**
   * <code>EUROPA_CONFERENCE_LEAGUE = 69;</code>
   */
  public static final int EUROPA_CONFERENCE_LEAGUE_VALUE = 69;
  /**
   * <code>CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 70;</code>
   */
  public static final int CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION_VALUE = 70;
  /**
   * <code>LEAGUE_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION = 71;</code>
   */
  public static final int LEAGUE_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION_VALUE = 71;
  /**
   * <code>WORLD_CUP = 72;</code>
   */
  public static final int WORLD_CUP_VALUE = 72;
  /**
   * <code>POSSIBLE_CHAMPIONSHIP_PLAY_OFF = 73;</code>
   */
  public static final int POSSIBLE_CHAMPIONSHIP_PLAY_OFF_VALUE = 73;
  /**
   * <code>QUALIFICATION_TO_QUARTER_FINALS = 74;</code>
   */
  public static final int QUALIFICATION_TO_QUARTER_FINALS_VALUE = 74;
  /**
   * <code>QUALIFICATION_TO_EIGHTH_FINALS = 75;</code>
   */
  public static final int QUALIFICATION_TO_EIGHTH_FINALS_VALUE = 75;
  /**
   * <code>DIVISION_CHAMPIONSHIP_PLAYOFF = 76;</code>
   */
  public static final int DIVISION_CHAMPIONSHIP_PLAYOFF_VALUE = 76;
  /**
   * <code>CONFERENCE_CHAMPIONSHIP_PLAYOFF = 77;</code>
   */
  public static final int CONFERENCE_CHAMPIONSHIP_PLAYOFF_VALUE = 77;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static StagePhases valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static StagePhases forNumber(int value) {
    switch (value) {
      case 0: return STAGE_PHASE_UNKNOWN;
      case 1: return PROMOTION;
      case 2: return RELEGATION;
      case 3: return CHAMPIONS_LEAGUE;
      case 4: return CHAMPIONS_LEAGUE_QUALIFICATION;
      case 5: return PLAY_OFF;
      case 6: return RELEGATION_PLAY_OFF;
      case 7: return PROMOTION_PLAY_OFF;
      case 8: return EUROPA_LEAGUE;
      case 9: return EUROPA_LEAGUE_QUALIFICATION;
      case 10: return QUALIFICATION_TO_NEXT_STAGE;
      case 11: return POSSIBLE_QUALIFICATION_TO_NEXT_STAGE;
      case 12: return CHAMPIONSHIP_PLAY_OFF;
      case 13: return CAF_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 14: return CAF_CONFEDERATION_CUP_QUALIFICATION;
      case 15: return AFC_CHAMPIONS_LEAGUE;
      case 16: return AFC_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 17: return AFC_CUP_QUALIFICATION;
      case 18: return AFC_PRESIDENTS_CUP;
      case 19: return COPA_LIBERTADORES;
      case 20: return COPA_LIBERTADORES_QUALIFICATION;
      case 21: return COPA_SUDAMERICANA;
      case 22: return OFC_CHAMPIONS_LEAGUE;
      case 23: return OFC_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 24: return CONCACAF_CHAMPIONS_LEAGUE;
      case 25: return CFU_CLUB_CHAMPIONSHIP;
      case 26: return AFC_CUP;
      case 27: return POSSIBLE_ASIAN_CUP;
      case 28: return ASIAN_CUP;
      case 29: return FA_CUP_GIVES_EUROPA_LEAGUE;
      case 30: return FA_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION;
      case 31: return FA_CUP_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION;
      case 32: return FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE;
      case 33: return FA_CUP_GIVES_AFC_CUP_QUALIFICATION;
      case 34: return FA_CUP_GIVES_COPA_LIBERTADORES;
      case 35: return FA_CUP_GIVES_COPA_SUDAMERICANA;
      case 37: return FA_CUP_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 38: return FA_CUP_GIVES_AFC_CUP;
      case 39: return FA_CUP_GIVES_CONCACAF_CHAMPIONS_LEAGUE;
      case 40: return FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_SPOT;
      case 41: return FA_CUP_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT;
      case 42: return FA_CUP_GIVES_COPA_LIBERTADORES_QUALIFICATION;
      case 43: return CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 44: return CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CHAMPIONS_LEAGUE;
      case 45: return CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE;
      case 46: return CHAMPIONSHIP_PLAY_OFF_GIVES_LEAGUE_QUALIFICATION;
      case 47: return CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE;
      case 48: return CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_LEAGUE_QUALIFICATION;
      case 49: return CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 50: return CHAMPIONSHIP_PLAY_OFF_GIVES_CAF_CONFEDERATION_CUP_QUALIFICATION;
      case 51: return CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP;
      case 52: return CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_CUP_QUALIFICATION;
      case 53: return CHAMPIONSHIP_PLAY_OFF_GIVES_AFC_PRESIDENTS_CUP;
      case 54: return CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE;
      case 55: return CHAMPIONSHIP_PLAY_OFF_GIVES_OFC_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 56: return CHAMPIONSHIP_PLAY_OFF_GIVES_CONCACAF_CHAMPIONS_LEAGUE;
      case 57: return CHAMPIONSHIP_PLAY_OFF_GIVES_CFU_CLUB_CHAMPIONSHIP;
      case 58: return CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES;
      case 59: return CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_LIBERTADORES_QUALIFICATION;
      case 60: return CHAMPIONSHIP_PLAY_OFF_GIVES_COPA_SUDAMERICANA;
      case 61: return CHAMPIONSHIP_PLAY_OFF_GIVES_CHAMPIONS_LEAGUE_QUALIFICATION;
      case 62: return LEAGUE_CUP_GIVES_EUROPA_LEAGUE_QUALIFICATION;
      case 63: return LEAGUE_CUP_WINNER_GIVES_EXTRA_EUROPA_LEAGUE_QUALIFICATION_SPOT;
      case 64: return COPA_LIBERTADORES_PLAYOFF_GIVES_COPA_SUDAMERICANA;
      case 65: return COPA_LIBERTADORES_PLAYOFF_GIVES_COPPA_LIBERTADORES;
      case 66: return FINAL_LEAGUE_PLAYOFF_GIVES_EUROPA_LEAGUE_QUALIFICATION;
      case 67: return FA_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION;
      case 68: return EUROPA_CONFERENCE_LEAGUE_QUALIFICATION;
      case 69: return EUROPA_CONFERENCE_LEAGUE;
      case 70: return CHAMPIONSHIP_PLAY_OFF_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION;
      case 71: return LEAGUE_CUP_GIVES_EUROPA_CONFERENCE_LEAGUE_QUALIFICATION;
      case 72: return WORLD_CUP;
      case 73: return POSSIBLE_CHAMPIONSHIP_PLAY_OFF;
      case 74: return QUALIFICATION_TO_QUARTER_FINALS;
      case 75: return QUALIFICATION_TO_EIGHTH_FINALS;
      case 76: return DIVISION_CHAMPIONSHIP_PLAYOFF;
      case 77: return CONFERENCE_CHAMPIONSHIP_PLAYOFF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<StagePhases>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      StagePhases> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<StagePhases>() {
          public StagePhases findValueByNumber(int number) {
            return StagePhases.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.sts.rpclib.Enums.getDescriptor().getEnumTypes().get(27);
  }

  private static final StagePhases[] VALUES = values();

  public static StagePhases valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private StagePhases(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.sts.rpclib.StagePhases)
}

