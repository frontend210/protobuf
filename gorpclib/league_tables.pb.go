// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.3
// source: league_tables.proto

package gorpclib

import (
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type LeagueTableEntry_LeagueTableKind int32

const (
	LeagueTableEntry_TOTAL LeagueTableEntry_LeagueTableKind = 0
	LeagueTableEntry_HOME  LeagueTableEntry_LeagueTableKind = 1
	LeagueTableEntry_AWAY  LeagueTableEntry_LeagueTableKind = 2
)

// Enum value maps for LeagueTableEntry_LeagueTableKind.
var (
	LeagueTableEntry_LeagueTableKind_name = map[int32]string{
		0: "TOTAL",
		1: "HOME",
		2: "AWAY",
	}
	LeagueTableEntry_LeagueTableKind_value = map[string]int32{
		"TOTAL": 0,
		"HOME":  1,
		"AWAY":  2,
	}
)

func (x LeagueTableEntry_LeagueTableKind) Enum() *LeagueTableEntry_LeagueTableKind {
	p := new(LeagueTableEntry_LeagueTableKind)
	*p = x
	return p
}

func (x LeagueTableEntry_LeagueTableKind) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (LeagueTableEntry_LeagueTableKind) Descriptor() protoreflect.EnumDescriptor {
	return file_league_tables_proto_enumTypes[0].Descriptor()
}

func (LeagueTableEntry_LeagueTableKind) Type() protoreflect.EnumType {
	return &file_league_tables_proto_enumTypes[0]
}

func (x LeagueTableEntry_LeagueTableKind) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use LeagueTableEntry_LeagueTableKind.Descriptor instead.
func (LeagueTableEntry_LeagueTableKind) EnumDescriptor() ([]byte, []int) {
	return file_league_tables_proto_rawDescGZIP(), []int{0, 0}
}

type LeagueTableMessage_LeagueTableGroups int32

const (
	LeagueTableMessage_LEAGUE     LeagueTableMessage_LeagueTableGroups = 0
	LeagueTableMessage_CONFERENCE LeagueTableMessage_LeagueTableGroups = 1
	LeagueTableMessage_DIVISION   LeagueTableMessage_LeagueTableGroups = 2
)

// Enum value maps for LeagueTableMessage_LeagueTableGroups.
var (
	LeagueTableMessage_LeagueTableGroups_name = map[int32]string{
		0: "LEAGUE",
		1: "CONFERENCE",
		2: "DIVISION",
	}
	LeagueTableMessage_LeagueTableGroups_value = map[string]int32{
		"LEAGUE":     0,
		"CONFERENCE": 1,
		"DIVISION":   2,
	}
)

func (x LeagueTableMessage_LeagueTableGroups) Enum() *LeagueTableMessage_LeagueTableGroups {
	p := new(LeagueTableMessage_LeagueTableGroups)
	*p = x
	return p
}

func (x LeagueTableMessage_LeagueTableGroups) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (LeagueTableMessage_LeagueTableGroups) Descriptor() protoreflect.EnumDescriptor {
	return file_league_tables_proto_enumTypes[1].Descriptor()
}

func (LeagueTableMessage_LeagueTableGroups) Type() protoreflect.EnumType {
	return &file_league_tables_proto_enumTypes[1]
}

func (x LeagueTableMessage_LeagueTableGroups) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use LeagueTableMessage_LeagueTableGroups.Descriptor instead.
func (LeagueTableMessage_LeagueTableGroups) EnumDescriptor() ([]byte, []int) {
	return file_league_tables_proto_rawDescGZIP(), []int{1, 0}
}

type LeagueTableEntry struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Ranking         int32                            `protobuf:"varint,1,opt,name=ranking,proto3" json:"ranking,omitempty"`
	TeamId          string                           `protobuf:"bytes,2,opt,name=team_id,json=teamId,proto3" json:"team_id,omitempty"`
	TeamName        []*LocalizedName                 `protobuf:"bytes,3,rep,name=team_name,json=teamName,proto3" json:"team_name,omitempty"`
	Played          string                           `protobuf:"bytes,4,opt,name=played,proto3" json:"played,omitempty"`
	Wins            string                           `protobuf:"bytes,5,opt,name=wins,proto3" json:"wins,omitempty"`
	Draws           string                           `protobuf:"bytes,6,opt,name=draws,proto3" json:"draws,omitempty"`
	Loss            string                           `protobuf:"bytes,7,opt,name=loss,proto3" json:"loss,omitempty"`
	GoalFor         string                           `protobuf:"bytes,8,opt,name=goal_for,json=goalFor,proto3" json:"goal_for,omitempty"`
	GoalAgainst     string                           `protobuf:"bytes,9,opt,name=goal_against,json=goalAgainst,proto3" json:"goal_against,omitempty"`
	GoalDifference  string                           `protobuf:"bytes,10,opt,name=goal_difference,json=goalDifference,proto3" json:"goal_difference,omitempty"`
	Points          string                           `protobuf:"bytes,11,opt,name=points,proto3" json:"points,omitempty"`
	Percentage      string                           `protobuf:"bytes,12,opt,name=percentage,proto3" json:"percentage,omitempty"`
	LeagueTableKind LeagueTableEntry_LeagueTableKind `protobuf:"varint,13,opt,name=league_table_kind,json=leagueTableKind,proto3,enum=com.sts.rpclib.LeagueTableEntry_LeagueTableKind" json:"league_table_kind,omitempty"`
	StagePhases     []int32                          `protobuf:"varint,14,rep,packed,name=stage_phases,json=stagePhases,proto3" json:"stage_phases,omitempty"`
	PointsDeduction string                           `protobuf:"bytes,15,opt,name=points_deduction,json=pointsDeduction,proto3" json:"points_deduction,omitempty"`
	Abandoned       string                           `protobuf:"bytes,16,opt,name=abandoned,proto3" json:"abandoned,omitempty"`
	NoResult        string                           `protobuf:"bytes,17,opt,name=no_result,json=noResult,proto3" json:"no_result,omitempty"`
	NetRunRate      string                           `protobuf:"bytes,18,opt,name=net_run_rate,json=netRunRate,proto3" json:"net_run_rate,omitempty"`
}

func (x *LeagueTableEntry) Reset() {
	*x = LeagueTableEntry{}
	if protoimpl.UnsafeEnabled {
		mi := &file_league_tables_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LeagueTableEntry) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LeagueTableEntry) ProtoMessage() {}

func (x *LeagueTableEntry) ProtoReflect() protoreflect.Message {
	mi := &file_league_tables_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LeagueTableEntry.ProtoReflect.Descriptor instead.
func (*LeagueTableEntry) Descriptor() ([]byte, []int) {
	return file_league_tables_proto_rawDescGZIP(), []int{0}
}

func (x *LeagueTableEntry) GetRanking() int32 {
	if x != nil {
		return x.Ranking
	}
	return 0
}

func (x *LeagueTableEntry) GetTeamId() string {
	if x != nil {
		return x.TeamId
	}
	return ""
}

func (x *LeagueTableEntry) GetTeamName() []*LocalizedName {
	if x != nil {
		return x.TeamName
	}
	return nil
}

func (x *LeagueTableEntry) GetPlayed() string {
	if x != nil {
		return x.Played
	}
	return ""
}

func (x *LeagueTableEntry) GetWins() string {
	if x != nil {
		return x.Wins
	}
	return ""
}

func (x *LeagueTableEntry) GetDraws() string {
	if x != nil {
		return x.Draws
	}
	return ""
}

func (x *LeagueTableEntry) GetLoss() string {
	if x != nil {
		return x.Loss
	}
	return ""
}

func (x *LeagueTableEntry) GetGoalFor() string {
	if x != nil {
		return x.GoalFor
	}
	return ""
}

func (x *LeagueTableEntry) GetGoalAgainst() string {
	if x != nil {
		return x.GoalAgainst
	}
	return ""
}

func (x *LeagueTableEntry) GetGoalDifference() string {
	if x != nil {
		return x.GoalDifference
	}
	return ""
}

func (x *LeagueTableEntry) GetPoints() string {
	if x != nil {
		return x.Points
	}
	return ""
}

func (x *LeagueTableEntry) GetPercentage() string {
	if x != nil {
		return x.Percentage
	}
	return ""
}

func (x *LeagueTableEntry) GetLeagueTableKind() LeagueTableEntry_LeagueTableKind {
	if x != nil {
		return x.LeagueTableKind
	}
	return LeagueTableEntry_TOTAL
}

func (x *LeagueTableEntry) GetStagePhases() []int32 {
	if x != nil {
		return x.StagePhases
	}
	return nil
}

func (x *LeagueTableEntry) GetPointsDeduction() string {
	if x != nil {
		return x.PointsDeduction
	}
	return ""
}

func (x *LeagueTableEntry) GetAbandoned() string {
	if x != nil {
		return x.Abandoned
	}
	return ""
}

func (x *LeagueTableEntry) GetNoResult() string {
	if x != nil {
		return x.NoResult
	}
	return ""
}

func (x *LeagueTableEntry) GetNetRunRate() string {
	if x != nil {
		return x.NetRunRate
	}
	return ""
}

type LeagueTableMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	CategoryId        string                               `protobuf:"bytes,1,opt,name=categoryId,proto3" json:"categoryId,omitempty"`
	CategoryName      []*LocalizedName                     `protobuf:"bytes,2,rep,name=categoryName,proto3" json:"categoryName,omitempty"`
	StageId           string                               `protobuf:"bytes,3,opt,name=stageId,proto3" json:"stageId,omitempty"`
	StageName         []*LocalizedName                     `protobuf:"bytes,4,rep,name=stageName,proto3" json:"stageName,omitempty"`
	Entries           []*LeagueTableEntry                  `protobuf:"bytes,5,rep,name=entries,proto3" json:"entries,omitempty"`
	LeagueTableGroups LeagueTableMessage_LeagueTableGroups `protobuf:"varint,6,opt,name=leagueTableGroups,proto3,enum=com.sts.rpclib.LeagueTableMessage_LeagueTableGroups" json:"leagueTableGroups,omitempty"`
	Sport             Sport                                `protobuf:"varint,7,opt,name=sport,proto3,enum=com.sts.rpclib.Sport" json:"sport,omitempty"`
	Season            string                               `protobuf:"bytes,8,opt,name=season,proto3" json:"season,omitempty"`
	Name              string                               `protobuf:"bytes,9,opt,name=name,proto3" json:"name,omitempty"`
	AdditionalInfo    []*LeagueTableAdditionalInfo         `protobuf:"bytes,10,rep,name=additionalInfo,proto3" json:"additionalInfo,omitempty"`
	TableName         []*LocalizedName                     `protobuf:"bytes,11,rep,name=tableName,proto3" json:"tableName,omitempty"`
}

func (x *LeagueTableMessage) Reset() {
	*x = LeagueTableMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_league_tables_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LeagueTableMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LeagueTableMessage) ProtoMessage() {}

func (x *LeagueTableMessage) ProtoReflect() protoreflect.Message {
	mi := &file_league_tables_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LeagueTableMessage.ProtoReflect.Descriptor instead.
func (*LeagueTableMessage) Descriptor() ([]byte, []int) {
	return file_league_tables_proto_rawDescGZIP(), []int{1}
}

func (x *LeagueTableMessage) GetCategoryId() string {
	if x != nil {
		return x.CategoryId
	}
	return ""
}

func (x *LeagueTableMessage) GetCategoryName() []*LocalizedName {
	if x != nil {
		return x.CategoryName
	}
	return nil
}

func (x *LeagueTableMessage) GetStageId() string {
	if x != nil {
		return x.StageId
	}
	return ""
}

func (x *LeagueTableMessage) GetStageName() []*LocalizedName {
	if x != nil {
		return x.StageName
	}
	return nil
}

func (x *LeagueTableMessage) GetEntries() []*LeagueTableEntry {
	if x != nil {
		return x.Entries
	}
	return nil
}

func (x *LeagueTableMessage) GetLeagueTableGroups() LeagueTableMessage_LeagueTableGroups {
	if x != nil {
		return x.LeagueTableGroups
	}
	return LeagueTableMessage_LEAGUE
}

func (x *LeagueTableMessage) GetSport() Sport {
	if x != nil {
		return x.Sport
	}
	return Sport_UNKNOWN_SPORT
}

func (x *LeagueTableMessage) GetSeason() string {
	if x != nil {
		return x.Season
	}
	return ""
}

func (x *LeagueTableMessage) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *LeagueTableMessage) GetAdditionalInfo() []*LeagueTableAdditionalInfo {
	if x != nil {
		return x.AdditionalInfo
	}
	return nil
}

func (x *LeagueTableMessage) GetTableName() []*LocalizedName {
	if x != nil {
		return x.TableName
	}
	return nil
}

type LeagueTableAdditionalInfo struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AdditionalInfoId string `protobuf:"bytes,1,opt,name=additionalInfoId,proto3" json:"additionalInfoId,omitempty"`
}

func (x *LeagueTableAdditionalInfo) Reset() {
	*x = LeagueTableAdditionalInfo{}
	if protoimpl.UnsafeEnabled {
		mi := &file_league_tables_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LeagueTableAdditionalInfo) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LeagueTableAdditionalInfo) ProtoMessage() {}

func (x *LeagueTableAdditionalInfo) ProtoReflect() protoreflect.Message {
	mi := &file_league_tables_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LeagueTableAdditionalInfo.ProtoReflect.Descriptor instead.
func (*LeagueTableAdditionalInfo) Descriptor() ([]byte, []int) {
	return file_league_tables_proto_rawDescGZIP(), []int{2}
}

func (x *LeagueTableAdditionalInfo) GetAdditionalInfoId() string {
	if x != nil {
		return x.AdditionalInfoId
	}
	return ""
}

type LeagueTableFullMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *LeagueTableFullMessage) Reset() {
	*x = LeagueTableFullMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_league_tables_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *LeagueTableFullMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*LeagueTableFullMessage) ProtoMessage() {}

func (x *LeagueTableFullMessage) ProtoReflect() protoreflect.Message {
	mi := &file_league_tables_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use LeagueTableFullMessage.ProtoReflect.Descriptor instead.
func (*LeagueTableFullMessage) Descriptor() ([]byte, []int) {
	return file_league_tables_proto_rawDescGZIP(), []int{3}
}

func (x *LeagueTableFullMessage) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_league_tables_proto protoreflect.FileDescriptor

var file_league_tables_proto_rawDesc = []byte{
	0x0a, 0x13, 0x6c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72,
	0x70, 0x63, 0x6c, 0x69, 0x62, 0x1a, 0x0c, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x0f, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0xb1, 0x05, 0x0a, 0x10, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54,
	0x61, 0x62, 0x6c, 0x65, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x12, 0x18, 0x0a, 0x07, 0x72, 0x61, 0x6e,
	0x6b, 0x69, 0x6e, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x52, 0x07, 0x72, 0x61, 0x6e, 0x6b,
	0x69, 0x6e, 0x67, 0x12, 0x17, 0x0a, 0x07, 0x74, 0x65, 0x61, 0x6d, 0x5f, 0x69, 0x64, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x74, 0x65, 0x61, 0x6d, 0x49, 0x64, 0x12, 0x3a, 0x0a, 0x09,
	0x74, 0x65, 0x61, 0x6d, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x08,
	0x74, 0x65, 0x61, 0x6d, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x6c, 0x61, 0x79,
	0x65, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x64,
	0x12, 0x12, 0x0a, 0x04, 0x77, 0x69, 0x6e, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x77, 0x69, 0x6e, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x64, 0x72, 0x61, 0x77, 0x73, 0x18, 0x06, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x05, 0x64, 0x72, 0x61, 0x77, 0x73, 0x12, 0x12, 0x0a, 0x04, 0x6c, 0x6f,
	0x73, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6c, 0x6f, 0x73, 0x73, 0x12, 0x19,
	0x0a, 0x08, 0x67, 0x6f, 0x61, 0x6c, 0x5f, 0x66, 0x6f, 0x72, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x07, 0x67, 0x6f, 0x61, 0x6c, 0x46, 0x6f, 0x72, 0x12, 0x21, 0x0a, 0x0c, 0x67, 0x6f, 0x61,
	0x6c, 0x5f, 0x61, 0x67, 0x61, 0x69, 0x6e, 0x73, 0x74, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0b, 0x67, 0x6f, 0x61, 0x6c, 0x41, 0x67, 0x61, 0x69, 0x6e, 0x73, 0x74, 0x12, 0x27, 0x0a, 0x0f,
	0x67, 0x6f, 0x61, 0x6c, 0x5f, 0x64, 0x69, 0x66, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x18,
	0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x67, 0x6f, 0x61, 0x6c, 0x44, 0x69, 0x66, 0x66, 0x65,
	0x72, 0x65, 0x6e, 0x63, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x18,
	0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x12, 0x1e, 0x0a,
	0x0a, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x61, 0x67, 0x65, 0x18, 0x0c, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0a, 0x70, 0x65, 0x72, 0x63, 0x65, 0x6e, 0x74, 0x61, 0x67, 0x65, 0x12, 0x5c, 0x0a,
	0x11, 0x6c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6b, 0x69,
	0x6e, 0x64, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x30, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73,
	0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x2e, 0x4c, 0x65, 0x61, 0x67, 0x75,
	0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x52, 0x0f, 0x6c, 0x65, 0x61, 0x67,
	0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x73,
	0x74, 0x61, 0x67, 0x65, 0x5f, 0x70, 0x68, 0x61, 0x73, 0x65, 0x73, 0x18, 0x0e, 0x20, 0x03, 0x28,
	0x05, 0x52, 0x0b, 0x73, 0x74, 0x61, 0x67, 0x65, 0x50, 0x68, 0x61, 0x73, 0x65, 0x73, 0x12, 0x29,
	0x0a, 0x10, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73, 0x5f, 0x64, 0x65, 0x64, 0x75, 0x63, 0x74, 0x69,
	0x6f, 0x6e, 0x18, 0x0f, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73,
	0x44, 0x65, 0x64, 0x75, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x1c, 0x0a, 0x09, 0x61, 0x62, 0x61,
	0x6e, 0x64, 0x6f, 0x6e, 0x65, 0x64, 0x18, 0x10, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x61, 0x62,
	0x61, 0x6e, 0x64, 0x6f, 0x6e, 0x65, 0x64, 0x12, 0x1b, 0x0a, 0x09, 0x6e, 0x6f, 0x5f, 0x72, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x18, 0x11, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x6e, 0x6f, 0x52, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x12, 0x20, 0x0a, 0x0c, 0x6e, 0x65, 0x74, 0x5f, 0x72, 0x75, 0x6e, 0x5f,
	0x72, 0x61, 0x74, 0x65, 0x18, 0x12, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x6e, 0x65, 0x74, 0x52,
	0x75, 0x6e, 0x52, 0x61, 0x74, 0x65, 0x22, 0x30, 0x0a, 0x0f, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x12, 0x09, 0x0a, 0x05, 0x54, 0x4f, 0x54,
	0x41, 0x4c, 0x10, 0x00, 0x12, 0x08, 0x0a, 0x04, 0x48, 0x4f, 0x4d, 0x45, 0x10, 0x01, 0x12, 0x08,
	0x0a, 0x04, 0x41, 0x57, 0x41, 0x59, 0x10, 0x02, 0x22, 0x96, 0x05, 0x0a, 0x12, 0x4c, 0x65, 0x61,
	0x67, 0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12,
	0x1e, 0x0a, 0x0a, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x49, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0a, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x49, 0x64, 0x12,
	0x41, 0x0a, 0x0c, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x4e, 0x61, 0x6d, 0x65, 0x18,
	0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e,
	0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64,
	0x4e, 0x61, 0x6d, 0x65, 0x52, 0x0c, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x4e, 0x61,
	0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x74, 0x61, 0x67, 0x65, 0x49, 0x64, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x74, 0x61, 0x67, 0x65, 0x49, 0x64, 0x12, 0x3b, 0x0a, 0x09,
	0x73, 0x74, 0x61, 0x67, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x09,
	0x73, 0x74, 0x61, 0x67, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x3a, 0x0a, 0x07, 0x65, 0x6e, 0x74,
	0x72, 0x69, 0x65, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x20, 0x2e, 0x63, 0x6f, 0x6d,
	0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x65, 0x61, 0x67,
	0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x07, 0x65, 0x6e,
	0x74, 0x72, 0x69, 0x65, 0x73, 0x12, 0x62, 0x0a, 0x11, 0x6c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54,
	0x61, 0x62, 0x6c, 0x65, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e,
	0x32, 0x34, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69,
	0x62, 0x2e, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x65, 0x73,
	0x73, 0x61, 0x67, 0x65, 0x2e, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x52, 0x11, 0x6c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54, 0x61,
	0x62, 0x6c, 0x65, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x12, 0x2b, 0x0a, 0x05, 0x73, 0x70, 0x6f,
	0x72, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x15, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73,
	0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x53, 0x70, 0x6f, 0x72, 0x74, 0x52,
	0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x65, 0x61, 0x73, 0x6f, 0x6e,
	0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x12,
	0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x12, 0x51, 0x0a, 0x0e, 0x61, 0x64, 0x64, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c,
	0x49, 0x6e, 0x66, 0x6f, 0x18, 0x0a, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x29, 0x2e, 0x63, 0x6f, 0x6d,
	0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x65, 0x61, 0x67,
	0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x41, 0x64, 0x64, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x61,
	0x6c, 0x49, 0x6e, 0x66, 0x6f, 0x52, 0x0e, 0x61, 0x64, 0x64, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x61,
	0x6c, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x3b, 0x0a, 0x09, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x4e, 0x61,
	0x6d, 0x65, 0x18, 0x0b, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73,
	0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69,
	0x7a, 0x65, 0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x09, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x4e, 0x61,
	0x6d, 0x65, 0x22, 0x3d, 0x0a, 0x11, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54, 0x61, 0x62, 0x6c,
	0x65, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x12, 0x0a, 0x0a, 0x06, 0x4c, 0x45, 0x41, 0x47, 0x55,
	0x45, 0x10, 0x00, 0x12, 0x0e, 0x0a, 0x0a, 0x43, 0x4f, 0x4e, 0x46, 0x45, 0x52, 0x45, 0x4e, 0x43,
	0x45, 0x10, 0x01, 0x12, 0x0c, 0x0a, 0x08, 0x44, 0x49, 0x56, 0x49, 0x53, 0x49, 0x4f, 0x4e, 0x10,
	0x02, 0x22, 0x47, 0x0a, 0x19, 0x4c, 0x65, 0x61, 0x67, 0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x41, 0x64, 0x64, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x49, 0x6e, 0x66, 0x6f, 0x12, 0x2a,
	0x0a, 0x10, 0x61, 0x64, 0x64, 0x69, 0x74, 0x69, 0x6f, 0x6e, 0x61, 0x6c, 0x49, 0x6e, 0x66, 0x6f,
	0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x61, 0x64, 0x64, 0x69, 0x74, 0x69,
	0x6f, 0x6e, 0x61, 0x6c, 0x49, 0x6e, 0x66, 0x6f, 0x49, 0x64, 0x22, 0x2c, 0x0a, 0x16, 0x4c, 0x65,
	0x61, 0x67, 0x75, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x46, 0x75, 0x6c, 0x6c, 0x4d, 0x65, 0x73,
	0x73, 0x61, 0x67, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70, 0x73, 0x63, 0x6f,
	0x72, 0x65, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66,
	0x2f, 0x67, 0x6f, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_league_tables_proto_rawDescOnce sync.Once
	file_league_tables_proto_rawDescData = file_league_tables_proto_rawDesc
)

func file_league_tables_proto_rawDescGZIP() []byte {
	file_league_tables_proto_rawDescOnce.Do(func() {
		file_league_tables_proto_rawDescData = protoimpl.X.CompressGZIP(file_league_tables_proto_rawDescData)
	})
	return file_league_tables_proto_rawDescData
}

var file_league_tables_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_league_tables_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_league_tables_proto_goTypes = []interface{}{
	(LeagueTableEntry_LeagueTableKind)(0),     // 0: com.sts.rpclib.LeagueTableEntry.LeagueTableKind
	(LeagueTableMessage_LeagueTableGroups)(0), // 1: com.sts.rpclib.LeagueTableMessage.LeagueTableGroups
	(*LeagueTableEntry)(nil),                  // 2: com.sts.rpclib.LeagueTableEntry
	(*LeagueTableMessage)(nil),                // 3: com.sts.rpclib.LeagueTableMessage
	(*LeagueTableAdditionalInfo)(nil),         // 4: com.sts.rpclib.LeagueTableAdditionalInfo
	(*LeagueTableFullMessage)(nil),            // 5: com.sts.rpclib.LeagueTableFullMessage
	(*LocalizedName)(nil),                     // 6: com.sts.rpclib.LocalizedName
	(Sport)(0),                                // 7: com.sts.rpclib.Sport
}
var file_league_tables_proto_depIdxs = []int32{
	6, // 0: com.sts.rpclib.LeagueTableEntry.team_name:type_name -> com.sts.rpclib.LocalizedName
	0, // 1: com.sts.rpclib.LeagueTableEntry.league_table_kind:type_name -> com.sts.rpclib.LeagueTableEntry.LeagueTableKind
	6, // 2: com.sts.rpclib.LeagueTableMessage.categoryName:type_name -> com.sts.rpclib.LocalizedName
	6, // 3: com.sts.rpclib.LeagueTableMessage.stageName:type_name -> com.sts.rpclib.LocalizedName
	2, // 4: com.sts.rpclib.LeagueTableMessage.entries:type_name -> com.sts.rpclib.LeagueTableEntry
	1, // 5: com.sts.rpclib.LeagueTableMessage.leagueTableGroups:type_name -> com.sts.rpclib.LeagueTableMessage.LeagueTableGroups
	7, // 6: com.sts.rpclib.LeagueTableMessage.sport:type_name -> com.sts.rpclib.Sport
	4, // 7: com.sts.rpclib.LeagueTableMessage.additionalInfo:type_name -> com.sts.rpclib.LeagueTableAdditionalInfo
	6, // 8: com.sts.rpclib.LeagueTableMessage.tableName:type_name -> com.sts.rpclib.LocalizedName
	9, // [9:9] is the sub-list for method output_type
	9, // [9:9] is the sub-list for method input_type
	9, // [9:9] is the sub-list for extension type_name
	9, // [9:9] is the sub-list for extension extendee
	0, // [0:9] is the sub-list for field type_name
}

func init() { file_league_tables_proto_init() }
func file_league_tables_proto_init() {
	if File_league_tables_proto != nil {
		return
	}
	file_sports_proto_init()
	file_languages_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_league_tables_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LeagueTableEntry); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_league_tables_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LeagueTableMessage); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_league_tables_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LeagueTableAdditionalInfo); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_league_tables_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*LeagueTableFullMessage); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_league_tables_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_league_tables_proto_goTypes,
		DependencyIndexes: file_league_tables_proto_depIdxs,
		EnumInfos:         file_league_tables_proto_enumTypes,
		MessageInfos:      file_league_tables_proto_msgTypes,
	}.Build()
	File_league_tables_proto = out.File
	file_league_tables_proto_rawDesc = nil
	file_league_tables_proto_goTypes = nil
	file_league_tables_proto_depIdxs = nil
}
