dessign-pattern-observer
========================

Observer Dessign Pattern sample program. Coding test from a Japanese company.

What is it?
-----------

It is an application based on the assignments received from the company Uzabase (http://www.uzabase.com)

The assignment (japanese version) may be reached in the link below:

https://mega.co.nz/#!OYkHHZ5D!K6FXAU87N_H_SNPn7nFMtXFtwdJXdOwNzL253rf8NQM

The application I made is a new version of the uzabase_assignment.rar, which is a JPanel with three objects 
shown in it. In the middle there is a red square and making an orbital movement around that red
square there is another blue square and a yellow sphere.

The task to be made consisted of changing the original application to be object-oriented
without changing the behavior itself.

The application is written in Java within the Eclipse IDE using Java 7 as the compiler.

It is delivered as a zip file called ProgrammingTestUzabaseByIvanPoza.zip.

Application Structure
----------------------

The ProgrammingTestUzabaseByIvanPoza.zip contains inside the following file structure: 
<pre><code>
<ul>
<li>[+] src/beans	Plain beans used to make the application more readable and clear</li>
<li>[+] src/components  Basic objects of the application (Component, DrawableComponent,...) </li>
<li>[+] src/interfaces  New interfaces to help implement the right behavior in the application like
				Observer, Subject (Observer pattern), Movable, Drawable (for the components)</li>
<li>[+] src/runnable    Contains the runnable class of the application. Application.java.</li>
<li>[+] src/subject     Contains the window (JPanel) showing the behavior of the application and also
		is the class that acts as the Subject in the implemented Observer pattern</li>
<li>[+] jar/     	Contains the java jar to be executed as an application</li>
<li>[+] bin/	Contains the compiled files of the project</li>
<li>[+] README.txt  Contains a brief explanation on the application and some other extra information</li>
<li>[+] .classpath	Eclipse classpath file</li>
<li>[+] .project	Eclipse Java Project file</li>
<li>[+] .settings	Eclipse settings directory</li>
</ul>
</code></pre>

The Latest Version
------------------

This is the only version.

Documentation
-------------

The documentation included is only an in-class documentation.

Known bugs
----------

There is not known bugs in the application but I have not included test classes because it
was not the main purpose of it. 

I might say that the in-class comments should be normalized and be written in only one language.
I have left the original Japanese comments and mix it up with English comments.

TODO Things
-----------

- Making test classes
- Write better comments (Right now there is a mix of original Japanese comments and the English
  comments I wrote). I can also write Japanese comments but I do rather write English comments
  for a better understanding of non-Japanese speakers.
- It might be interesting to use Spring Framework as a good practice, but the application is
  not that big enough though.

Installation/Execution
----------------------

The software does not need to be installed. As for the execution just download the jar file
called ProgrammingTestUzabase.jar to a directory and then execute the next command in the
command line:

<pre><code>java -jar ProgrammingTestUzabase.jar</code></pre>

Pre-requisites: You need Java installed in your computer.
(Note that I have compiled and executed the application with the Java 1.7 version, so
it might be needed this version to execute the application) Or just compile the files with
another version and then execute the application.

Contacts
--------

If there is any bug of just want to contact me:

You can contact me at: ivanpgs@gmail.com
I am also available at Linked-in: https://www.linkedin.com/profile/view?id=153419800

I have also a blog (written in Spanish) about Japan called http://japabanchel.com
