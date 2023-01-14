# Factory Design Pattern

This repo implements the Factory design pattern in Java. In this example, I am using Operating Systems as an example to showcase how using the factory pattern might be useful.

## Implementation

We have one factory class name OperatingSystemFactory that has one method, the method takes in a string and determines which object it should return. For example, if the string is "Windows", then it returnes a new instance of the Windows operating system.

### Why do we need the OperatingSystem interface?

Because from a client perspective, they do not know what operating systems are available, and they might not also know their names (class name), nor should they care. The client creates a new instance of Windows, Linux, etc. from the interface based on the input string. We are able to do that because of the factory class.

Another reason why the interface exists is in the getOS method in the factory class, we want to be able to return all types of OS in one method, without the interface, this is not possible to achieve.