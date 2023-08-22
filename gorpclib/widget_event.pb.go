// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        v4.23.3
// source: widget_event.proto

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

type WidgetEventMessage struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id         string          `protobuf:"bytes,1,opt,name=id,proto3" json:"id,omitempty"`
	EventType  WidgetEventType `protobuf:"varint,2,opt,name=eventType,proto3,enum=com.sts.rpclib.WidgetEventType" json:"eventType,omitempty"`
	RefEventId string          `protobuf:"bytes,3,opt,name=refEventId,proto3" json:"refEventId,omitempty"`
	Zone       PitchZone       `protobuf:"varint,4,opt,name=zone,proto3,enum=com.sts.rpclib.PitchZone" json:"zone,omitempty"`
	Timestamp  int64           `protobuf:"varint,5,opt,name=timestamp,proto3" json:"timestamp,omitempty"`
}

func (x *WidgetEventMessage) Reset() {
	*x = WidgetEventMessage{}
	if protoimpl.UnsafeEnabled {
		mi := &file_widget_event_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WidgetEventMessage) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WidgetEventMessage) ProtoMessage() {}

func (x *WidgetEventMessage) ProtoReflect() protoreflect.Message {
	mi := &file_widget_event_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WidgetEventMessage.ProtoReflect.Descriptor instead.
func (*WidgetEventMessage) Descriptor() ([]byte, []int) {
	return file_widget_event_proto_rawDescGZIP(), []int{0}
}

func (x *WidgetEventMessage) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *WidgetEventMessage) GetEventType() WidgetEventType {
	if x != nil {
		return x.EventType
	}
	return WidgetEventType_UNKNOWN_WIDGET_EVENT
}

func (x *WidgetEventMessage) GetRefEventId() string {
	if x != nil {
		return x.RefEventId
	}
	return ""
}

func (x *WidgetEventMessage) GetZone() PitchZone {
	if x != nil {
		return x.Zone
	}
	return PitchZone_UNKNOWN_PITCH_ZONE
}

func (x *WidgetEventMessage) GetTimestamp() int64 {
	if x != nil {
		return x.Timestamp
	}
	return 0
}

var File_widget_event_proto protoreflect.FileDescriptor

var file_widget_event_proto_rawDesc = []byte{
	0x0a, 0x12, 0x77, 0x69, 0x64, 0x67, 0x65, 0x74, 0x5f, 0x65, 0x76, 0x65, 0x6e, 0x74, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70,
	0x63, 0x6c, 0x69, 0x62, 0x1a, 0x0b, 0x65, 0x6e, 0x75, 0x6d, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x22, 0xd0, 0x01, 0x0a, 0x12, 0x57, 0x69, 0x64, 0x67, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e,
	0x74, 0x4d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x12, 0x3d, 0x0a, 0x09, 0x65, 0x76, 0x65, 0x6e,
	0x74, 0x54, 0x79, 0x70, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1f, 0x2e, 0x63, 0x6f,
	0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e, 0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x57, 0x69, 0x64,
	0x67, 0x65, 0x74, 0x45, 0x76, 0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x52, 0x09, 0x65, 0x76,
	0x65, 0x6e, 0x74, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1e, 0x0a, 0x0a, 0x72, 0x65, 0x66, 0x45, 0x76,
	0x65, 0x6e, 0x74, 0x49, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x72, 0x65, 0x66,
	0x45, 0x76, 0x65, 0x6e, 0x74, 0x49, 0x64, 0x12, 0x2d, 0x0a, 0x04, 0x7a, 0x6f, 0x6e, 0x65, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x19, 0x2e, 0x63, 0x6f, 0x6d, 0x2e, 0x73, 0x74, 0x73, 0x2e,
	0x72, 0x70, 0x63, 0x6c, 0x69, 0x62, 0x2e, 0x50, 0x69, 0x74, 0x63, 0x68, 0x5a, 0x6f, 0x6e, 0x65,
	0x52, 0x04, 0x7a, 0x6f, 0x6e, 0x65, 0x12, 0x1c, 0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74,
	0x61, 0x6d, 0x70, 0x18, 0x05, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73,
	0x74, 0x61, 0x6d, 0x70, 0x42, 0x2f, 0x50, 0x01, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x73, 0x6e, 0x61, 0x70, 0x73, 0x63, 0x6f, 0x72, 0x65, 0x67, 0x72,
	0x6f, 0x75, 0x70, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x67, 0x6f, 0x72,
	0x70, 0x63, 0x6c, 0x69, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_widget_event_proto_rawDescOnce sync.Once
	file_widget_event_proto_rawDescData = file_widget_event_proto_rawDesc
)

func file_widget_event_proto_rawDescGZIP() []byte {
	file_widget_event_proto_rawDescOnce.Do(func() {
		file_widget_event_proto_rawDescData = protoimpl.X.CompressGZIP(file_widget_event_proto_rawDescData)
	})
	return file_widget_event_proto_rawDescData
}

var file_widget_event_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_widget_event_proto_goTypes = []interface{}{
	(*WidgetEventMessage)(nil), // 0: com.sts.rpclib.WidgetEventMessage
	(WidgetEventType)(0),       // 1: com.sts.rpclib.WidgetEventType
	(PitchZone)(0),             // 2: com.sts.rpclib.PitchZone
}
var file_widget_event_proto_depIdxs = []int32{
	1, // 0: com.sts.rpclib.WidgetEventMessage.eventType:type_name -> com.sts.rpclib.WidgetEventType
	2, // 1: com.sts.rpclib.WidgetEventMessage.zone:type_name -> com.sts.rpclib.PitchZone
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_widget_event_proto_init() }
func file_widget_event_proto_init() {
	if File_widget_event_proto != nil {
		return
	}
	file_enums_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_widget_event_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WidgetEventMessage); i {
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
			RawDescriptor: file_widget_event_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_widget_event_proto_goTypes,
		DependencyIndexes: file_widget_event_proto_depIdxs,
		MessageInfos:      file_widget_event_proto_msgTypes,
	}.Build()
	File_widget_event_proto = out.File
	file_widget_event_proto_rawDesc = nil
	file_widget_event_proto_goTypes = nil
	file_widget_event_proto_depIdxs = nil
}
