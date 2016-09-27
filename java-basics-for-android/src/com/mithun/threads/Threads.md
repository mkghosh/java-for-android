*What is Threads in java?*
===========================
**Threads :** <p>Threads are concurrency management system in 
java. Java is very effecient to manage concurrency via 
threading mechanism. Java is a multithreaded programming 
language. For multitasking and concurrency thread is required.
Without thread multitasking is really hard to implement.
In real world although multitasking is not possible but task
switching. By using threads we can implement task switching 
very effeciently.</p>

**What is the reason to use a Thread ?** <p>You can ask 
can't I take advantage of other systems to implement multitasking? 
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
are easier then that of processes.</p>