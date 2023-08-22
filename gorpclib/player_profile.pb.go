// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.3
// source: player_profile.proto

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

type PlayerProfileMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Player *Player       `protobuf:"bytes,1,opt,name=player,proto3" json:"player,omitempty"`
	Teams  []*PlayerTeam `protobuf:"bytes,2,rep,name=teams,proto3" json:"teams,omitempty"`
	Sport  Sport         `protobuf:"varint,3,opt,name=sport,proto3,enum=com.sts.rpclib.Sport" json:"sport,omitempty"`
}

func (x *PlayerProfileMessage) Reset() {
	*x = PlayerProfileMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_player_profile_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PlayerProfileMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PlayerProfileMessage) ProtoMessage() {}

func (x *PlayerProfileMessage) ProtoReflect() protoreflect.Message {
	mi := &file_player_profile_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PlayerProfileMessage.ProtoReflect.Descriptor instead.
func (*PlayerProfileMessage) Descriptor() ([]byte, []int) {
	return file_player_profile_proto_rawDescGZIP(), []int{0}
}

func (x *PlayerProfileMessage) GetPlayer() *Player {
	if x != nil {
		return x.Player
	}
	return nil
}

func (x *PlayerProfileMessage) GetTeams() []*PlayerTeam {
	if x != nil {
		return x.Teams
	}
	return nil
}

func (x *PlayerProfileMessage) GetSport() Sport {
	if x != nil {
		return x.Sport
	}
	return Sport_UNKNOWN_SPORT
}

type Player struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id          string           `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	Name        []*LocalizedName `protobuf:"bytes,2,rep,name=name,proto3" json:"name,omitempty"`
	DateOfBirth int64            `protobuf:"varint,3,opt,name=dateOfBirth,proto3" json:"dateOfBirth,omitempty"`
	Height      float64          `protobuf:"fixed64,4,opt,name=height,proto3" json:"height,omitempty"`
	Weight      float64          `protobuf:"fixed64,5,opt,name=weight,proto3" json:"weight,omitempty"`
}

func (x *Player) Reset() {
	*x = Player{}
	if protoimpl.UnsafeEnabled {
		mi := &file_player_profile_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Player) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Player) ProtoMessage() {}

func (x *Player) ProtoReflect() protoreflect.Message {
	mi := &file_player_profile_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Player.ProtoReflect.Descriptor instead.
func (*Player) Descriptor() ([]byte, []int) {
	return file_player_profile_proto_rawDescGZIP(), []int{1}
}

func (x *Player) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Player) GetName() []*LocalizedName {
	if x != nil {
		return x.Name
	}
	return nil
}

func (x *Player) GetDateOfBirth() int64 {
	if x != nil {
		return x.DateOfBirth
	}
	return 0
}

func (x *Player) GetHeight() float64 {
	if x != nil {
		return x.Height
	}
	return 0
}

func (x *Player) GetWeight() float64 {
	if x != nil {
		return x.Weight
	}
	return 0
}

type PlayerTeam struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	DateFrom int64            `protobuf:"varint,1,opt,name=dateFrom,proto3" json:"dateFrom,omitempty"`
	DateTo   int64            `protobuf:"varint,2,opt,name=dateTo,proto3" json:"dateTo,omitempty"`
	Active   bool             `protobuf:"varint,3,opt,name=active,proto3" json:"active,omitempty"`
	Name     []*LocalizedName `protobuf:"bytes,4,rep,name=name,proto3" json:"name,omitempty"`
}

func (x *PlayerTeam) Reset() {
	*x = PlayerTeam{}
	if protoimpl.UnsafeEnabled {
		mi := &file_player_profile_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PlayerTeam) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PlayerTeam) ProtoMessage() {}

func (x *PlayerTeam) ProtoReflect() protoreflect.Message {
	mi := &file_player_profile_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PlayerTeam.ProtoReflect.Descriptor instead.
func (*PlayerTeam) Descriptor() ([]byte, []int) {
	return file_player_profile_proto_rawDescGZIP(), []int{2}
}

func (x *PlayerTeam) GetDateFrom() int64 {
	if x != nil {
		return x.DateFrom
	}
	return 0
}

func (x *PlayerTeam) GetDateTo() int64 {
	if x != nil {
		return x.DateTo
	}
	return 0
}

func (x *PlayerTeam) GetActive() bool {
	if x != nil {
		return x.Active
	}
	return false
}

func (x *PlayerTeam) GetName() []*LocalizedName {
	if x != nil {
		return x.Name
	}
	return nil
}

type PlayerProfileFullMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *PlayerProfileFullMessage) Reset() {
	*x = PlayerProfileFullMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_player_profile_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PlayerProfileFullMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PlayerProfileFullMessage) ProtoMessage() {}

func (x *PlayerProfileFullMessage) ProtoReflect() protoreflect.Message {
	mi := &file_player_profile_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PlayerProfileFullMessage.ProtoReflect.Descriptor instead.
func (*PlayerProfileFullMessage) Descriptor() ([]byte, []int) {
	return file_player_profile_proto_rawDescGZIP(), []int{3}
}

func (x *PlayerProfileFullMessage) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

var File_player_profile_proto protoreflect.FileDescriptor

var file_player_profile_proto_rawDesc = []byte{
	0x0a, 0x14, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x5f, 0x70, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e,
	0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x1a, 0x0c, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0f, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x73, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa5, 0x01, 0x0a, 0x14, 0x50, 0x6c, 0x61, 0x79, 0x65, 0x72,
	0x50, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x2e,
	0x0a, 0x06, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16,
	0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e,
	0x50, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x52, 0x06, 0x70, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x12, 0x30,
	0x0a, 0x05, 0x74, 0x65, 0x61, 0x6d, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1a, 0x2e,
	0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x50,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x54, 0x65, 0x61, 0x6d, 0x52, 0x05, 0x74, 0x65, 0x61, 0x6d, 0x73,
	0x12, 0x2b, 0x0a, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x15, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62,
	0x2e, 0x53, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x22, 0x9d, 0x01,
	0x0a, 0x06, 0x50, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x31, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73,
	0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65,
	0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x20, 0x0a, 0x0b, 0x64,
	0x61, 0x74, 0x65, 0x4f, 0x66, 0x42, 0x69, 0x72, 0x74, 0x68, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x0b, 0x64, 0x61, 0x74, 0x65, 0x4f, 0x66, 0x42, 0x69, 0x72, 0x74, 0x68, 0x12, 0x16, 0x0a,
	0x06, 0x68, 0x65, 0x69, 0x67, 0x68, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x01, 0x52, 0x06, 0x68,
	0x65, 0x69, 0x67, 0x68, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x77, 0x65, 0x69, 0x67, 0x68, 0x74, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x01, 0x52, 0x06, 0x77, 0x65, 0x69, 0x67, 0x68, 0x74, 0x22, 0x8b, 0x01,
	0x0a, 0x0a, 0x50, 0x6c, 0x61, 0x79, 0x65, 0x72, 0x54, 0x65, 0x61, 0x6d, 0x12, 0x1a, 0x0a, 0x08,
	0x64, 0x61, 0x74, 0x65, 0x46, 0x72, 0x6f, 0x6d, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08,
	0x64, 0x61, 0x74, 0x65, 0x46, 0x72, 0x6f, 0x6d, 0x12, 0x16, 0x0a, 0x06, 0x64, 0x61, 0x74, 0x65,
	0x54, 0x6f, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x06, 0x64, 0x61, 0x74, 0x65, 0x54, 0x6f,
	0x12, 0x16, 0x0a, 0x06, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08,
	0x52, 0x06, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x12, 0x31, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65,
	0x18, 0x04, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73,
	0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61, 0x6c, 0x69, 0x7a, 0x65,
	0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x22, 0x2e, 0x0a, 0x18, 0x50,
	0x6c, 0x61, 0x79, 0x65, 0x72, 0x50, 0x72, 0x6f, 0x66, 0x69, 0x6c, 0x65, 0x46, 0x75, 0x6c, 0x6c,
	0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x42, 0x2f, 0x50, 0x01, 0x5a,
	0x2b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70,
	0x73, 0x63, 0x6f, 0x72, 0x65, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_player_profile_proto_rawDescOnce sync.Once
	file_player_profile_proto_rawDescData = file_player_profile_proto_rawDesc
)

func file_player_profile_proto_rawDescGZIP() []byte {
	file_player_profile_proto_rawDescOnce.Do(func() {
		file_player_profile_proto_rawDescData = protoimpl.X.CompressGZIP(file_player_profile_proto_rawDescData)
	})
	return file_player_profile_proto_rawDescData
}

var file_player_profile_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_player_profile_proto_goTypes = []interface{}{
	(*PlayerProfileMessage)(nil),     // 0: com.sts.rpclib.PlayerProfileMessage
	(*Player)(nil),                   // 1: com.sts.rpclib.Player
	(*PlayerTeam)(nil),               // 2: com.sts.rpclib.PlayerTeam
	(*PlayerProfileFullMessage)(nil), // 3: com.sts.rpclib.PlayerProfileFullMessage
	(Sport)(0),                       // 4: com.sts.rpclib.Sport
	(*LocalizedName)(nil),            // 5: com.sts.rpclib.LocalizedName
}
var file_player_profile_proto_depIdxs = []int32{
	1, // 0: com.sts.rpclib.PlayerProfileMessage.player:type_name -> com.sts.rpclib.Player
	2, // 1: com.sts.rpclib.PlayerProfileMessage.teams:type_name -> com.sts.rpclib.PlayerTeam
	4, // 2: com.sts.rpclib.PlayerProfileMessage.sport:type_name -> com.sts.rpclib.Sport
	5, // 3: com.sts.rpclib.Player.name:type_name -> com.sts.rpclib.LocalizedName
	5, // 4: com.sts.rpclib.PlayerTeam.name:type_name -> com.sts.rpclib.LocalizedName
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_player_profile_proto_init() }
func file_player_profile_proto_init() {
	if File_player_profile_proto != nil {
		return
	}
	file_sports_proto_init()
	file_languages_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_player_profile_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PlayerProfileMessage); i {
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
		file_player_profile_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Player); i {
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
		file_player_profile_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PlayerTeam); i {
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
		file_player_profile_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PlayerProfileFullMessage); i {
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
			RawDescriptor: file_player_profile_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_player_profile_proto_goTypes,
		DependencyIndexes: file_player_profile_proto_depIdxs,
		MessageInfos:      file_player_profile_proto_msgTypes,
	}.Build()
	File_player_profile_proto = out.File
	file_player_profile_proto_rawDesc = nil
	file_player_profile_proto_goTypes = nil
	file_player_profile_proto_depIdxs = nil
}
