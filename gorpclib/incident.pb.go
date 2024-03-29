// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.3
// source: incident.proto

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

type ConfirmIncidentMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *ConfirmIncidentMessage) Reset() {
	*x = ConfirmIncidentMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_incident_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ConfirmIncidentMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ConfirmIncidentMessage) ProtoMessage() {}

func (x *ConfirmIncidentMessage) ProtoReflect() protoreflect.Message {
	mi := &file_incident_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ConfirmIncidentMessage.ProtoReflect.Descriptor instead.
func (*ConfirmIncidentMessage) Descriptor() ([]byte, []int) {
	return file_incident_proto_rawDescGZIP(), []int{0}
}

func (x *ConfirmIncidentMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type DeleteIncidentMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
}

func (x *DeleteIncidentMessage) Reset() {
	*x = DeleteIncidentMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_incident_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteIncidentMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteIncidentMessage) ProtoMessage() {}

func (x *DeleteIncidentMessage) ProtoReflect() protoreflect.Message {
	mi := &file_incident_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteIncidentMessage.ProtoReflect.Descriptor instead.
func (*DeleteIncidentMessage) Descriptor() ([]byte, []int) {
	return file_incident_proto_rawDescGZIP(), []int{1}
}

func (x *DeleteIncidentMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type AssistMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id   string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name,omitempty"`
}

func (x *AssistMessage) Reset() {
	*x = AssistMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_incident_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *AssistMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*AssistMessage) ProtoMessage() {}

func (x *AssistMessage) ProtoReflect() protoreflect.Message {
	mi := &file_incident_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use AssistMessage.ProtoReflect.Descriptor instead.
func (*AssistMessage) Descriptor() ([]byte, []int) {
	return file_incident_proto_rawDescGZIP(), []int{2}
}

func (x *AssistMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *AssistMessage) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

type IncidentMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	// The type of incident the message is about
	IncidentType IncidentType `protobuf:"varint,2,opt,name=incidentType,proto3,enum=com.sts.rpclib.IncidentType" json:"incidentType,omitempty"`
	Period       Period       `protobuf:"varint,3,opt,name=period,proto3,enum=com.sts.rpclib.Period" json:"period,omitempty"`
	// the minute of the incident
	Minute int32 `protobuf:"varint,4,opt,name=minute,proto3" json:"minute,omitempty"`
	// the second of the incident: in case for example of Ice Hockey
	Second int32 `protobuf:"varint,5,opt,name=second,proto3" json:"second,omitempty"`
	// this marks whether the incident is about the home or away team
	TeamNumber int32 `protobuf:"varint,6,opt,name=teamNumber,proto3" json:"teamNumber,omitempty"`
	// Player id
	PlayerId int64 `protobuf:"varint,7,opt,name=playerId,proto3" json:"playerId,omitempty"`
	// the playerIdOut, in case of substitution
	PlayerIdOut int64 `protobuf:"varint,8,opt,name=playerIdOut,proto3" json:"playerIdOut,omitempty"`
	// Player T shirt number
	PlayerNum int32 `protobuf:"varint,9,opt,name=playerNum,proto3" json:"playerNum,omitempty"`
	// Player T shirt number in case of subs
	PlayerNumOut int32 `protobuf:"varint,10,opt,name=playerNumOut,proto3" json:"playerNumOut,omitempty"`
	// Player name
	PlayerName    string `protobuf:"bytes,11,opt,name=playerName,proto3" json:"playerName,omitempty"`
	PlayerNameOut string `protobuf:"bytes,12,opt,name=playerNameOut,proto3" json:"playerNameOut,omitempty"`
	// Player short name: can be for example the Shirt Name
	PlayerShortName    string  `protobuf:"bytes,13,opt,name=playerShortName,proto3" json:"playerShortName,omitempty"`
	PlayerShortNameOut string  `protobuf:"bytes,14,opt,name=playerShortNameOut,proto3" json:"playerShortNameOut,omitempty"`
	Score              []int32 `protobuf:"varint,15,rep,packed,name=score,proto3" json:"score,omitempty"`
	// Additional information about the incident (goal via header for example)
	ExtraInfo                string           `protobuf:"bytes,16,opt,name=extraInfo,proto3" json:"extraInfo,omitempty"`
	IsShootoutWithTotalScore bool             `protobuf:"varint,17,opt,name=isShootoutWithTotalScore,proto3" json:"isShootoutWithTotalScore,omitempty"`
	Action                   UpdateAction     `protobuf:"varint,18,opt,name=action,proto3,enum=com.sts.rpclib.UpdateAction" json:"action,omitempty"`
	IsPlayerDataConfirmed    bool             `protobuf:"varint,19,opt,name=isPlayerDataConfirmed,proto3" json:"isPlayerDataConfirmed,omitempty"`
	SortOrder                int32            `protobuf:"varint,20,opt,name=sort_order,json=sortOrder,proto3" json:"sort_order,omitempty"`
	RefIncidentId            string           `protobuf:"bytes,21,opt,name=refIncidentId,proto3" json:"refIncidentId,omitempty"`
	Assists                  []*AssistMessage `protobuf:"bytes,22,rep,name=assists,proto3" json:"assists,omitempty"`
	Timestamp                int64            `protobuf:"varint,23,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
	MinutePlus               int32            `protobuf:"varint,24,opt,name=minutePlus,proto3" json:"minutePlus,omitempty"`
}

func (x *IncidentMessage) Reset() {
	*x = IncidentMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_incident_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *IncidentMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*IncidentMessage) ProtoMessage() {}

func (x *IncidentMessage) ProtoReflect() protoreflect.Message {
	mi := &file_incident_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use IncidentMessage.ProtoReflect.Descriptor instead.
func (*IncidentMessage) Descriptor() ([]byte, []int) {
	return file_incident_proto_rawDescGZIP(), []int{3}
}

func (x *IncidentMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *IncidentMessage) GetIncidentType() IncidentType {
	if x != nil {
		return x.IncidentType
	}
	return IncidentType_UNKNOWN_INCIDENT
}

func (x *IncidentMessage) GetPeriod() Period {
	if x != nil {
		return x.Period
	}
	return Period_UNKNOWN_PERIOD
}

func (x *IncidentMessage) GetMinute() int32 {
	if x != nil {
		return x.Minute
	}
	return 0
}

func (x *IncidentMessage) GetSecond() int32 {
	if x != nil {
		return x.Second
	}
	return 0
}

func (x *IncidentMessage) GetTeamNumber() int32 {
	if x != nil {
		return x.TeamNumber
	}
	return 0
}

func (x *IncidentMessage) GetPlayerId() int64 {
	if x != nil {
		return x.PlayerId
	}
	return 0
}

func (x *IncidentMessage) GetPlayerIdOut() int64 {
	if x != nil {
		return x.PlayerIdOut
	}
	return 0
}

func (x *IncidentMessage) GetPlayerNum() int32 {
	if x != nil {
		return x.PlayerNum
	}
	return 0
}

func (x *IncidentMessage) GetPlayerNumOut() int32 {
	if x != nil {
		return x.PlayerNumOut
	}
	return 0
}

func (x *IncidentMessage) GetPlayerName() string {
	if x != nil {
		return x.PlayerName
	}
	return ""
}

func (x *IncidentMessage) GetPlayerNameOut() string {
	if x != nil {
		return x.PlayerNameOut
	}
	return ""
}

func (x *IncidentMessage) GetPlayerShortName() string {
	if x != nil {
		return x.PlayerShortName
	}
	return ""
}

func (x *IncidentMessage) GetPlayerShortNameOut() string {
	if x != nil {
		return x.PlayerShortNameOut
	}
	return ""
}

func (x *IncidentMessage) GetScore() []int32 {
	if x != nil {
		return x.Score
	}
	return nil
}

func (x *IncidentMessage) GetExtraInfo() string {
	if x != nil {
		return x.ExtraInfo
	}
	return ""
}

func (x *IncidentMessage) GetIsShootoutWithTotalScore() bool {
	if x != nil {
		return x.IsShootoutWithTotalScore
	}
	return false
}

func (x *IncidentMessage) GetAction() UpdateAction {
	if x != nil {
		return x.Action
	}
	return UpdateAction_UPDATE
}

func (x *IncidentMessage) GetIsPlayerDataConfirmed() bool {
	if x != nil {
		return x.IsPlayerDataConfirmed
	}
	return false
}

func (x *IncidentMessage) GetSortOrder() int32 {
	if x != nil {
		return x.SortOrder
	}
	return 0
}

func (x *IncidentMessage) GetRefIncidentId() string {
	if x != nil {
		return x.RefIncidentId
	}
	return ""
}

func (x *IncidentMessage) GetAssists() []*AssistMessage {
	if x != nil {
		return x.Assists
	}
	return nil
}

func (x *IncidentMessage) GetTimestamp() int64 {
	if x != nil {
		return x.Timestamp
	}
	return 0
}

func (x *IncidentMessage) GetMinutePlus() int32 {
	if x != nil {
		return x.MinutePlus
	}
	return 0
}

var File_incident_proto protoreflect.FileDescriptor

var file_incident_proto_rawDesc = []byte{
	0x0a, 0x0e, 0x69, 0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x1a, 0x0b, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x28, 0x0a,
	0x16, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x49, 0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74,
	0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x22, 0x27, 0x0a, 0x15, 0x44, 0x65, 0x6c, 0x65, 0x74,
	0x65, 0x49, 0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65,
	0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64,
	0x22, 0x33, 0x0a, 0x0d, 0x41, 0x73, 0x73, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69,
	0x64, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x9f, 0x07, 0x0a, 0x0f, 0x49, 0x6e, 0x63, 0x69, 0x64, 0x65,
	0x6e, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x40, 0x0a, 0x0c, 0x69, 0x6e, 0x63,
	0x69, 0x64, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x1c, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x2e, 0x49, 0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x52, 0x0c, 0x69,
	0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x2e, 0x0a, 0x06, 0x70,
	0x65, 0x72, 0x69, 0x6f, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x16, 0x2e, 0x63, 0x6f,
	0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x50, 0x65, 0x72,
	0x69, 0x6f, 0x64, 0x52, 0x06, 0x70, 0x65, 0x72, 0x69, 0x6f, 0x64, 0x12, 0x16, 0x0a, 0x06, 0x6d,
	0x69, 0x6e, 0x75, 0x74, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x6d, 0x69, 0x6e,
	0x75, 0x74, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x65, 0x63, 0x6f, 0x6e, 0x64, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x05, 0x52, 0x06, 0x73, 0x65, 0x63, 0x6f, 0x6e, 0x64, 0x12, 0x1e, 0x0a, 0x0a, 0x74,
	0x65, 0x61, 0x6d, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x18, 0x06, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x0a, 0x74, 0x65, 0x61, 0x6d, 0x4e, 0x75, 0x6d, 0x62, 0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08, 0x70,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x49, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x70,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x49, 0x64, 0x12, 0x20, 0x0a, 0x0b, 0x70, 0x6c, 0x61, 0x79, 0x65,
	0x72, 0x49, 0x64, 0x4f, 0x75, 0x74, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0b, 0x70, 0x6c,
	0x61, 0x79, 0x65, 0x72, 0x49, 0x64, 0x4f, 0x75, 0x74, 0x12, 0x1c, 0x0a, 0x09, 0x70, 0x6c, 0x61,
	0x79, 0x65, 0x72, 0x4e, 0x75, 0x6d, 0x18, 0x09, 0x20, 0x01, 0x28, 0x05, 0x52, 0x09, 0x70, 0x6c,
	0x61, 0x79, 0x65, 0x72, 0x4e, 0x75, 0x6d, 0x12, 0x22, 0x0a, 0x0c, 0x70, 0x6c, 0x61, 0x79, 0x65,
	0x72, 0x4e, 0x75, 0x6d, 0x4f, 0x75, 0x74, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0c, 0x70,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x4e, 0x75, 0x6d, 0x4f, 0x75, 0x74, 0x12, 0x1e, 0x0a, 0x0a, 0x70,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x4e, 0x61, 0x6d, 0x65, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x0a, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x24, 0x0a, 0x0d, 0x70,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x4e, 0x61, 0x6d, 0x65, 0x4f, 0x75, 0x74, 0x18, 0x0c, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x0d, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x4e, 0x61, 0x6d, 0x65, 0x4f, 0x75,
	0x74, 0x12, 0x28, 0x0a, 0x0f, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x53, 0x68, 0x6f, 0x72, 0x74,
	0x4e, 0x61, 0x6d, 0x65, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x70, 0x6c, 0x61, 0x79,
	0x65, 0x72, 0x53, 0x68, 0x6f, 0x72, 0x74, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x2e, 0x0a, 0x12, 0x70,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x53, 0x68, 0x6f, 0x72, 0x74, 0x4e, 0x61, 0x6d, 0x65, 0x4f, 0x75,
	0x74, 0x18, 0x0e, 0x20, 0x01, 0x28, 0x09, 0x52, 0x12, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x53,
	0x68, 0x6f, 0x72, 0x74, 0x4e, 0x61, 0x6d, 0x65, 0x4f, 0x75, 0x74, 0x12, 0x18, 0x0a, 0x05, 0x73,
	0x63, 0x6f, 0x72, 0x65, 0x18, 0x0f, 0x20, 0x03, 0x28, 0x05, 0x42, 0x02, 0x10, 0x01, 0x52, 0x05,
	0x73, 0x63, 0x6f, 0x72, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x65, 0x78, 0x74, 0x72, 0x61, 0x49, 0x6e,
	0x66, 0x6f, 0x18, 0x10, 0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x65, 0x78, 0x74, 0x72, 0x61, 0x49,
	0x6e, 0x66, 0x6f, 0x12, 0x3a, 0x0a, 0x18, 0x69, 0x73, 0x53, 0x68, 0x6f, 0x6f, 0x74, 0x6f, 0x75,
	0x74, 0x57, 0x69, 0x74, 0x68, 0x54, 0x6f, 0x74, 0x61, 0x6c, 0x53, 0x63, 0x6f, 0x72, 0x65, 0x18,
	0x11, 0x20, 0x01, 0x28, 0x08, 0x52, 0x18, 0x69, 0x73, 0x53, 0x68, 0x6f, 0x6f, 0x74, 0x6f, 0x75,
	0x74, 0x57, 0x69, 0x74, 0x68, 0x54, 0x6f, 0x74, 0x61, 0x6c, 0x53, 0x63, 0x6f, 0x72, 0x65, 0x12,
	0x34, 0x0a, 0x06, 0x61, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x18, 0x12, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x1c, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x06, 0x61,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x34, 0x0a, 0x15, 0x69, 0x73, 0x50, 0x6c, 0x61, 0x79, 0x65,
	0x72, 0x44, 0x61, 0x74, 0x61, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64, 0x18, 0x13,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x15, 0x69, 0x73, 0x50, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x44, 0x61,
	0x74, 0x61, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x72, 0x6d, 0x65, 0x64, 0x12, 0x1d, 0x0a, 0x0a, 0x73,
	0x6f, 0x72, 0x74, 0x5f, 0x6f, 0x72, 0x64, 0x65, 0x72, 0x18, 0x14, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x09, 0x73, 0x6f, 0x72, 0x74, 0x4f, 0x72, 0x64, 0x65, 0x72, 0x12, 0x24, 0x0a, 0x0d, 0x72, 0x65,
	0x66, 0x49, 0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x49, 0x64, 0x18, 0x15, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0d, 0x72, 0x65, 0x66, 0x49, 0x6e, 0x63, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x49, 0x64,
	0x12, 0x37, 0x0a, 0x07, 0x61, 0x73, 0x73, 0x69, 0x73, 0x74, 0x73, 0x18, 0x16, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c,
	0x69, 0x62, 0x2e, 0x41, 0x73, 0x73, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65,
	0x52, 0x07, 0x61, 0x73, 0x73, 0x69, 0x73, 0x74, 0x73, 0x12, 0x1c, 0x0a, 0x09, 0x74, 0x69, 0x6d,
	0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x17, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x74, 0x69,
	0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x12, 0x1e, 0x0a, 0x0a, 0x6d, 0x69, 0x6e, 0x75, 0x74,
	0x65, 0x50, 0x6c, 0x75, 0x73, 0x18, 0x18, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0a, 0x6d, 0x69, 0x6e,
	0x75, 0x74, 0x65, 0x50, 0x6c, 0x75, 0x73, 0x42, 0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70, 0x73, 0x63, 0x6f, 0x72,
	0x65, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f,
	0x67, 0x6f, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_incident_proto_rawDescOnce sync.Once
	file_incident_proto_rawDescData = file_incident_proto_rawDesc
)

func file_incident_proto_rawDescGZIP() []byte {
	file_incident_proto_rawDescOnce.Do(func() {
		file_incident_proto_rawDescData = protoimpl.X.CompressGZIP(file_incident_proto_rawDescData)
	})
	return file_incident_proto_rawDescData
}

var file_incident_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_incident_proto_goTypes = []interface{}{
	(*ConfirmIncidentMessage)(nil), // 0: com.sts.rpclib.ConfirmIncidentMessage
	(*DeleteIncidentMessage)(nil),  // 1: com.sts.rpclib.DeleteIncidentMessage
	(*AssistMessage)(nil),          // 2: com.sts.rpclib.AssistMessage
	(*IncidentMessage)(nil),        // 3: com.sts.rpclib.IncidentMessage
	(IncidentType)(0),              // 4: com.sts.rpclib.IncidentType
	(Period)(0),                    // 5: com.sts.rpclib.Period
	(UpdateAction)(0),              // 6: com.sts.rpclib.UpdateAction
}
var file_incident_proto_depIdxs = []int32{
	4, // 0: com.sts.rpclib.IncidentMessage.incidentType:type_name -> com.sts.rpclib.IncidentType
	5, // 1: com.sts.rpclib.IncidentMessage.period:type_name -> com.sts.rpclib.Period
	6, // 2: com.sts.rpclib.IncidentMessage.action:type_name -> com.sts.rpclib.UpdateAction
	2, // 3: com.sts.rpclib.IncidentMessage.assists:type_name -> com.sts.rpclib.AssistMessage
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_incident_proto_init() }
func file_incident_proto_init() {
	if File_incident_proto != nil {
		return
	}
	file_enums_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_incident_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ConfirmIncidentMessage); i {
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
		file_incident_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteIncidentMessage); i {
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
		file_incident_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*AssistMessage); i {
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
		file_incident_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*IncidentMessage); i {
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
			RawDescriptor: file_incident_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_incident_proto_goTypes,
		DependencyIndexes: file_incident_proto_depIdxs,
		MessageInfos:      file_incident_proto_msgTypes,
	}.Build()
	File_incident_proto = out.File
	file_incident_proto_rawDesc = nil
	file_incident_proto_goTypes = nil
	file_incident_proto_depIdxs = nil
}
