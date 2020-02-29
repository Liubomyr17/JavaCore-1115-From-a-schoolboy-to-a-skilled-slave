package com.company;

/*

1115 From a schoolboy to a skilled slave
Change four classes: Schoolboy (student), Student (student), Worker (Employee), Slave (Slave).
Inherit a student from a student, an employee from a student, a slave from an employee.
Requirements:
1. In the class Solution there must be a public class Schoolboy (student).
2. In the class Solution there must be a public class Student (student).
3. The Solution class must have a public Worker class.
4. In the class Solution there must be a public class Slave (Slave).
5. Student must be inherited from Schoolboy.
6. The Worker class must be inherited from the Student class.
7. The Slave class must be inherited from the Worker class.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) {
    }
    public class Schoolboy {
    }
    public class Student extends Schoolboy {
    }
    public class Worker extends Student {
    }
    public class Slave extends Worker {
    }
}
