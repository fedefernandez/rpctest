package rpctest {
  import higherkindness.mu.rpc.protocol._

  @outputPackage("rpctest.pkg")
  object protocol {
    @message
    case class HelloRequest(name: String)

    @message
    case class HelloResponse(message: String)

    @service(Protobuf, Identity, Some("rpctest.pkg"), Capitalize)
    trait Greeter[F[_]] {
      def sayHello(request: HelloRequest): F[HelloResponse]
    }
  }
}
