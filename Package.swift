// swift-tools-version:5.3
// The swift-tools-version declares the minimum version of Swift required to build this package.
import PackageDescription
let package = Package(
    name: "Wire",
    products: [
        // Products define the executables and libraries a package produces, and make them visible to other packages.
        .library( name: "Wire", targets: ["Wire"]),
    ],
    targets: [
        .target(
            name: "Wire",
            // Target includes source files located in the specified path
            path: "wire-library/wire-runtime-swift/src/main/swift"
        )
    ]
)