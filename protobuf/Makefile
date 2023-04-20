.PHONY: golang java

golang:
	go install google.golang.org/protobuf/cmd/protoc-gen-go@latest; \
        go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest; \
        protoc -I=proto --go_out=. --go-grpc_out=. proto/*.proto;
	cp -v gorpclib/go.mod github.com/snapscoregroup/protobuf/gorpclib/;
	cp -v gorpclib/go.sum github.com/snapscoregroup/protobuf/gorpclib/;
	rm -rf gorpclib;
	cp -av github.com/snapscoregroup/protobuf/gorpclib ./;
	rm -rf github.com;
java:
	go install google.golang.org/protobuf/cmd/protoc-gen-go@latest; \
        # go install google.golang.org/grpc/cmd/protoc-gen-go-grpc@latest; \
	protoc -I=proto --java_out=java proto/*.proto;
