// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.30.0
// 	protoc        v3.21.5
// source: stages.proto

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

type StageMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *StageMessage) Reset() {
	*x = StageMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_stages_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StageMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StageMessage) ProtoMessage() {}

func (x *StageMessage) ProtoReflect() protoreflect.Message {
	mi := &file_stages_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StageMessage.ProtoReflect.Descriptor instead.
func (*StageMessage) Descriptor() ([]byte, []int) {
	return file_stages_proto_rawDescGZIP(), []int{0}
}

func (x *StageMessage) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

type StageParticipantsStatisticsFullMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *StageParticipantsStatisticsFullMessage) Reset() {
	*x = StageParticipantsStatisticsFullMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_stages_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StageParticipantsStatisticsFullMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StageParticipantsStatisticsFullMessage) ProtoMessage() {}

func (x *StageParticipantsStatisticsFullMessage) ProtoReflect() protoreflect.Message {
	mi := &file_stages_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StageParticipantsStatisticsFullMessage.ProtoReflect.Descriptor instead.
func (*StageParticipantsStatisticsFullMessage) Descriptor() ([]byte, []int) {
	return file_stages_proto_rawDescGZIP(), []int{1}
}

func (x *StageParticipantsStatisticsFullMessage) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

type StageParticipantsStatisticsMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Participants []*ParticipantMessage `protobuf:"bytes,1,rep,name=participants,proto3" json:"participants,omitempty"`
	StageId      string                `protobuf:"bytes,2,opt,name=stageId,proto3" json:"stageId,omitempty"`
	Season       string                `protobuf:"bytes,3,opt,name=season,proto3" json:"season,omitempty"`
	Sport        Sport                 `protobuf:"varint,4,opt,name=sport,proto3,enum=com.sts.rpclib.Sport" json:"sport,omitempty"`
}

func (x *StageParticipantsStatisticsMessage) Reset() {
	*x = StageParticipantsStatisticsMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_stages_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StageParticipantsStatisticsMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StageParticipantsStatisticsMessage) ProtoMessage() {}

func (x *StageParticipantsStatisticsMessage) ProtoReflect() protoreflect.Message {
	mi := &file_stages_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StageParticipantsStatisticsMessage.ProtoReflect.Descriptor instead.
func (*StageParticipantsStatisticsMessage) Descriptor() ([]byte, []int) {
	return file_stages_proto_rawDescGZIP(), []int{2}
}

func (x *StageParticipantsStatisticsMessage) GetParticipants() []*ParticipantMessage {
	if x != nil {
		return x.Participants
	}
	return nil
}

func (x *StageParticipantsStatisticsMessage) GetStageId() string {
	if x != nil {
		return x.StageId
	}
	return ""
}

func (x *StageParticipantsStatisticsMessage) GetSeason() string {
	if x != nil {
		return x.Season
	}
	return ""
}

func (x *StageParticipantsStatisticsMessage) GetSport() Sport {
	if x != nil {
		return x.Sport
	}
	return Sport_UNKNOWN_SPORT
}

var File_stages_proto protoreflect.FileDescriptor

var file_stages_proto_rawDesc = []byte{
	0x0a, 0x0c, 0x73, 0x74, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e,
	0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x1a, 0x0b,
	0x6d, 0x61, 0x74, 0x63, 0x68, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0c, 0x73, 0x70, 0x6f,
	0x72, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x22, 0x0a, 0x0c, 0x53, 0x74, 0x61,
	0x67, 0x65, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74,
	0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x22, 0x3c, 0x0a,
	0x26, 0x53, 0x74, 0x61, 0x67, 0x65, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x73, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x46, 0x75, 0x6c, 0x6c,
	0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61, 0x22, 0xcb, 0x01, 0x0a, 0x22,
	0x53, 0x74, 0x61, 0x67, 0x65, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74,
	0x73, 0x53, 0x74, 0x61, 0x74, 0x69, 0x73, 0x74, 0x69, 0x63, 0x73, 0x4d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x12, 0x46, 0x0a, 0x0c, 0x70, 0x61, 0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e,
	0x74, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x22, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73,
	0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x50, 0x61, 0x72, 0x74, 0x69, 0x63,
	0x69, 0x70, 0x61, 0x6e, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x52, 0x0c, 0x70, 0x61,
	0x72, 0x74, 0x69, 0x63, 0x69, 0x70, 0x61, 0x6e, 0x74, 0x73, 0x12, 0x18, 0x0a, 0x07, 0x73, 0x74,
	0x61, 0x67, 0x65, 0x49, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x74, 0x61,
	0x67, 0x65, 0x49, 0x64, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x65, 0x61, 0x73, 0x6f, 0x6e, 0x12, 0x2b, 0x0a, 0x05,
	0x73, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x15, 0x2e, 0x63, 0x6f,
	0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x53, 0x70, 0x6f,
	0x72, 0x74, 0x52, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x42, 0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70, 0x73, 0x63,
	0x6f, 0x72, 0x65, 0x67, 0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2f, 0x67, 0x6f, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_stages_proto_rawDescOnce sync.Once
	file_stages_proto_rawDescData = file_stages_proto_rawDesc
)

func file_stages_proto_rawDescGZIP() []byte {
	file_stages_proto_rawDescOnce.Do(func() {
		file_stages_proto_rawDescData = protoimpl.X.CompressGZIP(file_stages_proto_rawDescData)
	})
	return file_stages_proto_rawDescData
}

var file_stages_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_stages_proto_goTypes = []interface{}{
	(*StageMessage)(nil),                           // 0: com.sts.rpclib.StageMessage
	(*StageParticipantsStatisticsFullMessage)(nil), // 1: com.sts.rpclib.StageParticipantsStatisticsFullMessage
	(*StageParticipantsStatisticsMessage)(nil),     // 2: com.sts.rpclib.StageParticipantsStatisticsMessage
	(*ParticipantMessage)(nil),                     // 3: com.sts.rpclib.ParticipantMessage
	(Sport)(0),                                     // 4: com.sts.rpclib.Sport
}
var file_stages_proto_depIdxs = []int32{
	3, // 0: com.sts.rpclib.StageParticipantsStatisticsMessage.participants:type_name -> com.sts.rpclib.ParticipantMessage
	4, // 1: com.sts.rpclib.StageParticipantsStatisticsMessage.sport:type_name -> com.sts.rpclib.Sport
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_stages_proto_init() }
func file_stages_proto_init() {
	if File_stages_proto != nil {
		return
	}
	file_match_proto_init()
	file_sports_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_stages_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StageMessage); i {
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
		file_stages_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StageParticipantsStatisticsFullMessage); i {
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
		file_stages_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StageParticipantsStatisticsMessage); i {
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
			RawDescriptor: file_stages_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_stages_proto_goTypes,
		DependencyIndexes: file_stages_proto_depIdxs,
		MessageInfos:      file_stages_proto_msgTypes,
	}.Build()
	File_stages_proto = out.File
	file_stages_proto_rawDesc = nil
	file_stages_proto_goTypes = nil
	file_stages_proto_depIdxs = nil
}
