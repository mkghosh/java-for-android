*Threads in java*
===========================
**Threads :** 
<p>
    Threads are concurrency management system in java. Java is very 
    efficient to manage concurrency via threading mechanism. Java is a multithreaded programming 
    language. For multitasking and concurrency thread is required.
    Without thread multitasking is really hard to implement.
    In real world although multitasking is not possible but task
    switching. By using threads we can implement task switching very efficiently.

**What is the reason to use a Thread ?** 
<p>
    You can ask can't I take advantage of other systems to implement multitasking? 
    Or you can ask why should I use thread if I can manage concurrency via a different
    way? The simple ans is yes you can take advantage of process instead of 
    threads but there is some problems to work with processes that is
    why you should always try to use thread if possible. First we have to
    know what is a process? A process is like a simple small application. 
    As an example we can tell that in a word processor program printing is 
    done by a different process then the main program. Now what are
    the problems will you face when you are trying to implement process
    instead of thread? Processes expensive then threads. The communication
    between processes is complex and processes are memory inefficient.
    On the other hand you can use the same data structure or same 
    resources from multiple threads. The communication between threads
    are easier then that of processes.

**How many types of threads are there in java?**
<p>
    There are two types of thread in java. 
     <br>
         _1) User Thread and <br>
         2) Daemon Thread_
    <p>
        **1) User Thread :** The threads created by the application is called user thread.
         User threads are the master thread in java. The main thread is also a user 
         thread. 
        <br><br>
        **2) Daemon Thread :** The threads created by JVM for some house keeping task is
        called Daemon thread. Daemon threads are slave threads. These types of threads 
        are created for serving the user threads. As soon as all the user threads stopped
        or dead the daemon threads will also be vanished or killed by the JVM because as 
        there is no user thread is alive so what is the point to keep a helper thread 
        which has been created only to help those user threads?

**How to create a thread?**
<p>
    There are two ways to create a thread. The first one is to extend the thread
    class as the parent class and the second one is to implement the runnable interface
    and provide a runnable object to the thread constructor as a parameter. 
    The second one is more effective then that of the first one because in the first one 
    one have to extend the thread class so he\/she doesn't has a option to extend any other
    class if required and all the irrelevent methods of the thread class will be inherrited 
    automatically which is not the intention of the developer. But in the second way developer
    has the choice to extend another class and here only one method is available and will reduce
    memory consumption.
    
