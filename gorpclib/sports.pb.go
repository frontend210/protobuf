// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.3
// source: sports.proto

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

type Sport int32

const (
	Sport_UNKNOWN_SPORT     Sport = 0
	Sport_SOCCER            Sport = 1
	Sport_TENNIS            Sport = 2
	Sport_ICE_HOCKEY        Sport = 3
	Sport_BASKETBALL        Sport = 4
	Sport_CRICKET           Sport = 5
	Sport_VOLLEYBALL        Sport = 6
	Sport_HANDBALL          Sport = 7
	Sport_RUGBY             Sport = 8
	Sport_AMERICAN_FOOTBALL Sport = 9
	Sport_GOLF              Sport = 10
	Sport_BEACH_VOLLEY      Sport = 11
	Sport_SNOOKER           Sport = 12
	Sport_ESPORT            Sport = 13
	Sport_RUGBY_UNION       Sport = 14
	Sport_BASEBALL          Sport = 15
)

// Enum value maps for Sport.
var (
	Sport_name = map[int32]string{
		0:  "UNKNOWN_SPORT",
		1:  "SOCCER",
		2:  "TENNIS",
		3:  "ICE_HOCKEY",
		4:  "BASKETBALL",
		5:  "CRICKET",
		6:  "VOLLEYBALL",
		7:  "HANDBALL",
		8:  "RUGBY",
		9:  "AMERICAN_FOOTBALL",
		10: "GOLF",
		11: "BEACH_VOLLEY",
		12: "SNOOKER",
		13: "ESPORT",
		14: "RUGBY_UNION",
		15: "BASEBALL",
	}
	Sport_value = map[string]int32{
		"UNKNOWN_SPORT":     0,
		"SOCCER":            1,
		"TENNIS":            2,
		"ICE_HOCKEY":        3,
		"BASKETBALL":        4,
		"CRICKET":           5,
		"VOLLEYBALL":        6,
		"HANDBALL":          7,
		"RUGBY":             8,
		"AMERICAN_FOOTBALL": 9,
		"GOLF":              10,
		"BEACH_VOLLEY":      11,
		"SNOOKER":           12,
		"ESPORT":            13,
		"RUGBY_UNION":       14,
		"BASEBALL":          15,
	}
)

func (x Sport) Enum() *Sport {
	p := new(Sport)
	*p = x
	return p
}

func (x Sport) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Sport) Descriptor() protoreflect.EnumDescriptor {
	return file_sports_proto_enumTypes[0].Descriptor()
}

func (Sport) Type() protoreflect.EnumType {
	return &file_sports_proto_enumTypes[0]
}

func (x Sport) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Sport.Descriptor instead.
func (Sport) EnumDescriptor() ([]byte, []int) {
	return file_sports_proto_rawDescGZIP(), []int{0}
}

type SportMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Sport Sport            `protobuf:"varint,1,opt,name=sport,proto3,enum=com.sts.rpclib.Sport" json:"sport,omitempty"`
	Name  []*LocalizedName `protobuf:"bytes,2,rep,name=name,proto3" json:"name,omitempty"`
}

func (x *SportMessage) Reset() {
	*x = SportMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_sports_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SportMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SportMessage) ProtoMessage() {}

func (x *SportMessage) ProtoReflect() protoreflect.Message {
	mi := &file_sports_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SportMessage.ProtoReflect.Descriptor instead.
func (*SportMessage) Descriptor() ([]byte, []int) {
	return file_sports_proto_rawDescGZIP(), []int{0}
}

func (x *SportMessage) GetSport() Sport {
	if x != nil {
		return x.Sport
	}
	return Sport_UNKNOWN_SPORT
}

func (x *SportMessage) GetName() []*LocalizedName {
	if x != nil {
		return x.Name
	}
	return nil
}

var File_sports_proto protoreflect.FileDescriptor

var file_sports_proto_rawDesc = []byte{
	0x0a, 0x0c, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e,
	0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x1a, 0x0f,
	0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x6e, 0x0a, 0x0c, 0x53, 0x70, 0x6f, 0x72, 0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12,
	0x2b, 0x0a, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x15,
	0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e,
	0x53, 0x70, 0x6f, 0x72, 0x74, 0x52, 0x05, 0x73, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x31, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x1d, 0x2e, 0x63, 0x6f, 0x6d,
	0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x4c, 0x6f, 0x63, 0x61,
	0x6c, 0x69, 0x7a, 0x65, 0x64, 0x4e, 0x61, 0x6d, 0x65, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x2a,
	0xf3, 0x01, 0x0a, 0x05, 0x53, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x11, 0x0a, 0x0d, 0x55, 0x4e, 0x4b,
	0x4e, 0x4f, 0x57, 0x4e, 0x5f, 0x53, 0x50, 0x4f, 0x52, 0x54, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06,
	0x53, 0x4f, 0x43, 0x43, 0x45, 0x52, 0x10, 0x01, 0x12, 0x0a, 0x0a, 0x06, 0x54, 0x45, 0x4e, 0x4e,
	0x49, 0x53, 0x10, 0x02, 0x12, 0x0e, 0x0a, 0x0a, 0x49, 0x43, 0x45, 0x5f, 0x48, 0x4f, 0x43, 0x4b,
	0x45, 0x59, 0x10, 0x03, 0x12, 0x0e, 0x0a, 0x0a, 0x42, 0x41, 0x53, 0x4b, 0x45, 0x54, 0x42, 0x41,
	0x4c, 0x4c, 0x10, 0x04, 0x12, 0x0b, 0x0a, 0x07, 0x43, 0x52, 0x49, 0x43, 0x4b, 0x45, 0x54, 0x10,
	0x05, 0x12, 0x0e, 0x0a, 0x0a, 0x56, 0x4f, 0x4c, 0x4c, 0x45, 0x59, 0x42, 0x41, 0x4c, 0x4c, 0x10,
	0x06, 0x12, 0x0c, 0x0a, 0x08, 0x48, 0x41, 0x4e, 0x44, 0x42, 0x41, 0x4c, 0x4c, 0x10, 0x07, 0x12,
	0x09, 0x0a, 0x05, 0x52, 0x55, 0x47, 0x42, 0x59, 0x10, 0x08, 0x12, 0x15, 0x0a, 0x11, 0x41, 0x4d,
	0x45, 0x52, 0x49, 0x43, 0x41, 0x4e, 0x5f, 0x46, 0x4f, 0x4f, 0x54, 0x42, 0x41, 0x4c, 0x4c, 0x10,
	0x09, 0x12, 0x08, 0x0a, 0x04, 0x47, 0x4f, 0x4c, 0x46, 0x10, 0x0a, 0x12, 0x10, 0x0a, 0x0c, 0x42,
	0x45, 0x41, 0x43, 0x48, 0x5f, 0x56, 0x4f, 0x4c, 0x4c, 0x45, 0x59, 0x10, 0x0b, 0x12, 0x0b, 0x0a,
	0x07, 0x53, 0x4e, 0x4f, 0x4f, 0x4b, 0x45, 0x52, 0x10, 0x0c, 0x12, 0x0a, 0x0a, 0x06, 0x45, 0x53,
	0x50, 0x4f, 0x52, 0x54, 0x10, 0x0d, 0x12, 0x0f, 0x0a, 0x0b, 0x52, 0x55, 0x47, 0x42, 0x59, 0x5f,
	0x55, 0x4e, 0x49, 0x4f, 0x4e, 0x10, 0x0e, 0x12, 0x0c, 0x0a, 0x08, 0x42, 0x41, 0x53, 0x45, 0x42,
	0x41, 0x4c, 0x4c, 0x10, 0x0f, 0x42, 0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70, 0x73, 0x63, 0x6f, 0x72, 0x65, 0x67,
	0x72, 0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f,
	0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_sports_proto_rawDescOnce sync.Once
	file_sports_proto_rawDescData = file_sports_proto_rawDesc
)

func file_sports_proto_rawDescGZIP() []byte {
	file_sports_proto_rawDescOnce.Do(func() {
		file_sports_proto_rawDescData = protoimpl.X.CompressGZIP(file_sports_proto_rawDescData)
	})
	return file_sports_proto_rawDescData
}

var file_sports_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_sports_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_sports_proto_goTypes = []interface{}{
	(Sport)(0),            // 0: com.sts.rpclib.Sport
	(*SportMessage)(nil),  // 1: com.sts.rpclib.SportMessage
	(*LocalizedName)(nil), // 2: com.sts.rpclib.LocalizedName
}
var file_sports_proto_depIdxs = []int32{
	0, // 0: com.sts.rpclib.SportMessage.sport:type_name -> com.sts.rpclib.Sport
	2, // 1: com.sts.rpclib.SportMessage.name:type_name -> com.sts.rpclib.LocalizedName
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_sports_proto_init() }
func file_sports_proto_init() {
	if File_sports_proto != nil {
		return
	}
	file_languages_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_sports_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SportMessage); i {
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
			RawDescriptor: file_sports_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_sports_proto_goTypes,
		DependencyIndexes: file_sports_proto_depIdxs,
		EnumInfos:         file_sports_proto_enumTypes,
		MessageInfos:      file_sports_proto_msgTypes,
	}.Build()
	File_sports_proto = out.File
	file_sports_proto_rawDesc = nil
	file_sports_proto_goTypes = nil
	file_sports_proto_depIdxs = nil
}
