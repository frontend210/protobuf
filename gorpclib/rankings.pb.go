// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.21.5
// source: rankings.proto

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

type RankingsMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	CategoryId   string                   `protobuf:"bytes,1,opt,name=categoryId,proto3" json:"categoryId,omitempty"`
	CategoryName []*LocalizedName         `protobuf:"bytes,2,rep,name=categoryName,proto3" json:"categoryName,omitempty"`
	StageId      string                   `protobuf:"bytes,3,opt,name=stageId,proto3" json:"stageId,omitempty"`
	StageName    []*LocalizedName         `protobuf:"bytes,4,rep,name=stageName,proto3" json:"stageName,omitempty"`
	Polls        map[string]*RankingsPoll `protobuf:"bytes,5,rep,name=polls,proto3" json:"polls,omitempty" protobuf_key:"bytes,1,opt,name=key,proto3" protobuf_val:"bytes,2,opt,name=value,proto3"`
	Sport        Sport                    `protobuf:"varint,6,opt,name=sport,proto3,enum=com.sts.rpclib.Sport" json:"sport,omitempty"`
	Season       string                   `protobuf:"bytes,7,opt,name=season,proto3" json:"season,omitempty"`
}

func (x *RankingsMessage) Reset() {
	*x = RankingsMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_rankings_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RankingsMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RankingsMessage) ProtoMessage() {}

func (x *RankingsMessage) ProtoReflect() protoreflect.Message {
	mi := &file_rankings_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RankingsMessage.ProtoReflect.Descriptor instead.
func (*RankingsMessage) Descriptor() ([]byte, []int) {
	return file_rankings_proto_rawDescGZIP(), []int{0}
}

func (x *RankingsMessage) GetCategoryId() string {
	if x != nil {
		return x.CategoryId
	}
	return ""
}

func (x *RankingsMessage) GetCategoryName() []*LocalizedName {
	if x != nil {
		return x.CategoryName
	}
	return nil
}

func (x *RankingsMessage) GetStageId() string {
	if x != nil {
		return x.StageId
	}
	return ""
}

func (x *RankingsMessage) GetStageName() []*LocalizedName {
	if x != nil {
		return x.StageName
	}
	return nil
}

func (x *RankingsMessage) GetPolls() map[string]*RankingsPoll {
	if x != nil {
		return x.Polls
	}
	return nil
}

func (x *RankingsMessage) GetSport() Sport {
	if x != nil {
		return x.Sport
	}
	return Sport_UNKNOWN_SPORT
}

func (x *RankingsMessage) GetSeason() string {
	if x != nil {
		return x.Season
	}
	return ""
}

type RankingsPoll struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	PollId        string          `protobuf:"bytes,1,opt,name=pollId,proto3" json:"pollId,omitempty"`
	PollName      string          `protobuf:"bytes,2,opt,name=pollName,proto3" json:"pollName,omitempty"`
	Week          string          `protobuf:"bytes,3,opt,name=week,proto3" json:"week,omitempty"`
	EffectiveTime int64           `protobuf:"varint,4,opt,name=effectiveTime,proto3" json:"effectiveTime,omitempty"`
	Entries       []*RankingEntry `protobuf:"bytes,5,rep,name=entries,proto3" json:"entries,omitempty"`
}

func (x *RankingsPoll) Reset() {
	*x = RankingsPoll{}
	if protoimpl.UnsafeEnabled {
		mi := &file_rankings_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RankingsPoll) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RankingsPoll) ProtoMessage() {}

func (x *RankingsPoll) ProtoReflect() protoreflect.Message {
	mi := &file_rankings_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RankingsPoll.ProtoReflect.Descriptor instead.
func (*RankingsPoll) Descriptor() ([]byte, []int) {
	return file_rankings_proto_rawDescGZIP(), []int{1}
}

func (x *RankingsPoll) GetPollId() string {
	if x != nil {
		return x.PollId
	}
	return ""
}

func (x *RankingsPoll) GetPollName() string {
	if x != nil {
		return x.PollName
	}
	return ""
}

func (x *RankingsPoll) GetWeek() string {
	if x != nil {
		return x.Week
	}
	return ""
}

func (x *RankingsPoll) GetEffectiveTime() int64 {
	if x != nil {
		return x.EffectiveTime
	}
	return 0
}

func (x *RankingsPoll) GetEntries() []*RankingEntry {
	if x != nil {
		return x.Entries
	}
	return nil
}

type RankingEntry struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	TeamId          string           `protobuf:"bytes,1,opt,name=teamId,proto3" json:"teamId,omitempty"`
	TeamName        []*LocalizedName `protobuf:"bytes,2,rep,name=team_name,json=teamName,proto3" json:"team_name,omitempty"`
	Ranking         int32            `protobuf:"varint,3,opt,name=ranking,proto3" json:"ranking,omitempty"`
	PreviousRanking int32            `protobuf:"varint,4,opt,name=previousRanking,proto3" json:"previousRanking,omitempty"`
	Wins            int32            `protobuf:"varint,5,opt,name=wins,proto3" json:"wins,omitempty"`
	Losses          int32            `protobuf:"varint,6,opt,name=losses,proto3" json:"losses,omitempty"`
	Points          int32            `protobuf:"varint,7,opt,name=points,proto3" json:"points,omitempty"`
}

func (x *RankingEntry) Reset() {
	*x = RankingEntry{}
	if protoimpl.UnsafeEnabled {
		mi := &file_rankings_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RankingEntry) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RankingEntry) ProtoMessage() {}

func (x *RankingEntry) ProtoReflect() protoreflect.Message {
	mi := &file_rankings_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RankingEntry.ProtoReflect.Descriptor instead.
func (*RankingEntry) Descriptor() ([]byte, []int) {
	return file_rankings_proto_rawDescGZIP(), []int{2}
}

func (x *RankingEntry) GetTeamId() string {
	if x != nil {
		return x.TeamId
	}
	return ""
}

func (x *RankingEntry) GetTeamName() []*LocalizedName {
	if x != nil {
		return x.TeamName
	}
	return nil
}

func (x *RankingEntry) GetRanking() int32 {
	if x != nil {
		return x.Ranking
	}
	return 0
}

func (x *RankingEntry) GetPreviousRanking() int32 {
	if x != nil {
		return x.PreviousRanking
	}
	return 0
}

func (x *RankingEntry) GetWins() int32 {
	if x != nil {
		return x.Wins
	}
	return 0
}

func (x *RankingEntry) GetLosses() int32 {
	if x != nil {
		return x.Losses
	}
	return 0
}

func (x *RankingEntry) GetPoints() int32 {
	if x != nil {
		return x.Points
	}
	return 0
}

type RankingsFullMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *RankingsFullMessage) Reset() {
	*x = RankingsFullMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_rankings_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RankingsFullMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RankingsFullMessage) ProtoMessage() {}

func (x *RankingsFullMessage) ProtoReflect() protoreflect.Message {
	mi := &file_rankings_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RankingsFullMessage.ProtoReflect.Descriptor instead.
func (*RankingsFullMessage) Descriptor() ([]byte, []int) {
	return file_rankings_proto_rawDescGZIP(), []int{3}
}

func (x *RankingsFullMessage) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_rankings_proto protoreflect.FileDescriptor

var file_rankings_proto_rawDesc = []byte{
	0x0a, 0x0e, 0x72, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x1a, 0x0f, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x0c, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0xaa, 0x03, 0x0a, 0x0f, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x73, 0x4d, 0x65, 0x73, 0x73,
	0x61, 0x67, 0x65, 0x12, 0x1e, 0x0a, 0x0a, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x49,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72,
	0x79, 0x49, 0x64, 0x12, 0x41, 0x0a, 0x0c, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f, 0x72, 0x79, 0x4e,
	0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e,
	0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c,
	0x69, 0x7a, 0x65, 0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x0c, 0x63, 0x61, 0x74, 0x65, 0x67, 0x6f,
	0x72, 0x79, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x74, 0x61, 0x67, 0x65, 0x49,
	0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x74, 0x61, 0x67, 0x65, 0x49, 0x64,
	0x12, 0x3b, 0x0a, 0x09, 0x73, 0x74, 0x61, 0x67, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70,
	0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64, 0x4e, 0x61,
	0x6d, 0x65, 0x52, 0x09, 0x73, 0x74, 0x61, 0x67, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x40, 0x0a,
	0x05, 0x70, 0x6f, 0x6c, 0x6c, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x2a, 0x2e, 0x63,
	0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x52, 0x61,
	0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x73, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x2e, 0x50, 0x6f,
	0x6c, 0x6c, 0x73, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x05, 0x70, 0x6f, 0x6c, 0x6c, 0x73, 0x12,
	0x2b, 0x0a, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x15,
	0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e,
	0x53, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x16, 0x0a, 0x06,
	0x73, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x65,
	0x61, 0x73, 0x6f, 0x6e, 0x1a, 0x56, 0x0a, 0x0a, 0x50, 0x6f, 0x6c, 0x6c, 0x73, 0x45, 0x6e, 0x74,
	0x72, 0x79, 0x12, 0x10, 0x0a, 0x03, 0x6b, 0x65, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x03, 0x6b, 0x65, 0x79, 0x12, 0x32, 0x0a, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70,
	0x63, 0x6c, 0x69, 0x62, 0x2e, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x73, 0x50, 0x6f, 0x6c,
	0x6c, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x3a, 0x02, 0x38, 0x01, 0x22, 0xb4, 0x01, 0x0a,
	0x0c, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x73, 0x50, 0x6f, 0x6c, 0x6c, 0x12, 0x16, 0x0a,
	0x06, 0x70, 0x6f, 0x6c, 0x6c, 0x49, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70,
	0x6f, 0x6c, 0x6c, 0x49, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x6f, 0x6c, 0x6c, 0x4e, 0x61, 0x6d,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x70, 0x6f, 0x6c, 0x6c, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x12, 0x0a, 0x04, 0x77, 0x65, 0x65, 0x6b, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x04, 0x77, 0x65, 0x65, 0x6b, 0x12, 0x24, 0x0a, 0x0d, 0x65, 0x66, 0x66, 0x65, 0x63, 0x74, 0x69,
	0x76, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0d, 0x65, 0x66,
	0x66, 0x65, 0x63, 0x74, 0x69, 0x76, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x36, 0x0a, 0x07, 0x65,
	0x6e, 0x74, 0x72, 0x69, 0x65, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1c, 0x2e, 0x63,
	0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x52, 0x61,
	0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x07, 0x65, 0x6e, 0x74, 0x72,
	0x69, 0x65, 0x73, 0x22, 0xea, 0x01, 0x0a, 0x0c, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x45,
	0x6e, 0x74, 0x72, 0x79, 0x12, 0x16, 0x0a, 0x06, 0x74, 0x65, 0x61, 0x6d, 0x49, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x74, 0x65, 0x61, 0x6d, 0x49, 0x64, 0x12, 0x3a, 0x0a, 0x09,
	0x74, 0x65, 0x61, 0x6d, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65, 0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x08,
	0x74, 0x65, 0x61, 0x6d, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x72, 0x61, 0x6e, 0x6b,
	0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x07, 0x72, 0x61, 0x6e, 0x6b, 0x69,
	0x6e, 0x67, 0x12, 0x28, 0x0a, 0x0f, 0x70, 0x72, 0x65, 0x76, 0x69, 0x6f, 0x75, 0x73, 0x52, 0x61,
	0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0f, 0x70, 0x72, 0x65,
	0x76, 0x69, 0x6f, 0x75, 0x73, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x12, 0x12, 0x0a, 0x04,
	0x77, 0x69, 0x6e, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x05, 0x52, 0x04, 0x77, 0x69, 0x6e, 0x73,
	0x12, 0x16, 0x0a, 0x06, 0x6c, 0x6f, 0x73, 0x73, 0x65, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x06, 0x6c, 0x6f, 0x73, 0x73, 0x65, 0x73, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x6f, 0x69, 0x6e,
	0x74, 0x73, 0x18, 0x07, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x73,
	0x22, 0x29, 0x0a, 0x13, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x73, 0x46, 0x75, 0x6c, 0x6c,
	0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0x2f, 0x50, 0x01, 0x5a,
	0x2b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70,
	0x73, 0x63, 0x6f, 0x72, 0x65, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_rankings_proto_rawDescOnce sync.Once
	file_rankings_proto_rawDescData = file_rankings_proto_rawDesc
)

func file_rankings_proto_rawDescGZIP() []byte {
	file_rankings_proto_rawDescOnce.Do(func() {
		file_rankings_proto_rawDescData = protoimpl.X.CompressGZIP(file_rankings_proto_rawDescData)
	})
	return file_rankings_proto_rawDescData
}

var file_rankings_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_rankings_proto_goTypes = []interface{}{
	(*RankingsMessage)(nil),     // 0: com.sts.rpclib.RankingsMessage
	(*RankingsPoll)(nil),        // 1: com.sts.rpclib.RankingsPoll
	(*RankingEntry)(nil),        // 2: com.sts.rpclib.RankingEntry
	(*RankingsFullMessage)(nil), // 3: com.sts.rpclib.RankingsFullMessage
	nil,                         // 4: com.sts.rpclib.RankingsMessage.PollsEntry
	(*LocalizedName)(nil),       // 5: com.sts.rpclib.LocalizedName
	(Sport)(0),                  // 6: com.sts.rpclib.Sport
}
var file_rankings_proto_depIdxs = []int32{
	5, // 0: com.sts.rpclib.RankingsMessage.categoryName:type_name -> com.sts.rpclib.LocalizedName
	5, // 1: com.sts.rpclib.RankingsMessage.stageName:type_name -> com.sts.rpclib.LocalizedName
	4, // 2: com.sts.rpclib.RankingsMessage.polls:type_name -> com.sts.rpclib.RankingsMessage.PollsEntry
	6, // 3: com.sts.rpclib.RankingsMessage.sport:type_name -> com.sts.rpclib.Sport
	2, // 4: com.sts.rpclib.RankingsPoll.entries:type_name -> com.sts.rpclib.RankingEntry
	5, // 5: com.sts.rpclib.RankingEntry.team_name:type_name -> com.sts.rpclib.LocalizedName
	1, // 6: com.sts.rpclib.RankingsMessage.PollsEntry.value:type_name -> com.sts.rpclib.RankingsPoll
	7, // [7:7] is the sub-list for method output_type
	7, // [7:7] is the sub-list for method input_type
	7, // [7:7] is the sub-list for extension type_name
	7, // [7:7] is the sub-list for extension extendee
	0, // [0:7] is the sub-list for field type_name
}

func init() { file_rankings_proto_init() }
func file_rankings_proto_init() {
	if File_rankings_proto != nil {
		return
	}
	file_languages_proto_init()
	file_sports_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_rankings_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RankingsMessage); i {
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
		file_rankings_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RankingsPoll); i {
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
		file_rankings_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RankingEntry); i {
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
		file_rankings_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RankingsFullMessage); i {
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
			RawDescriptor: file_rankings_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_rankings_proto_goTypes,
		DependencyIndexes: file_rankings_proto_depIdxs,
		MessageInfos:      file_rankings_proto_msgTypes,
	}.Build()
	File_rankings_proto = out.File
	file_rankings_proto_rawDesc = nil
	file_rankings_proto_goTypes = nil
	file_rankings_proto_depIdxs = nil
}
