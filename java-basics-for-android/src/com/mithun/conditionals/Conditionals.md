## Conditionals : 
<p>In any programming language conditionals have a great place for them.
Without conditionals it is not possible to take decision. There are three types of 
conditionals in java. They are <b>if/else</b>, <b>switch</b> and <b>ternary</b>. in <b>java</b> <b>if/else</b> conditional
can have multiple branches. When it needs to create multiple branch then the two keyword are comming together.
As an example we can write the <b>if/else</b> condition like below.
    <p> 
        if(condition) {
        <br/>
            &nbsp;&nbsp;&nbsp;&nbsp;doSomeThing;
        <br/>
        } else {
        <br/>
            &nbsp;&nbsp;&nbsp;&nbsp;doOtherThing;
        <br/>
        }
    </p>
</p> 
<p> 
    Now the other <b>if/else</b> condition (i.e multiple <b>if/else</b>) can be written as:
    <p>
    if(condition) {
    <br/>
        &nbsp;&nbsp;&nbsp;&nbsp;doSomeThing;
    <br/>
    } else if(otherCondition){
    <br/>
        &nbsp;&nbsp;&nbsp;&nbsp;doOtherThing;
    <br/>
    } else {
    <br/>
        &nbsp;&nbsp;&nbsp;&nbsp;doYetOtherThing;
    <br/>
    }
    </p>
    In this type of <b>if/else</b> condition there could be multiple <b>else if</b> not problem with that.
    And <b>if/else</b> condition can be nested (i.e <b>if/else</b> condition can be form inside another <b>if/else</b>).
</p>
Now comes the ternary operator in java. Ternary operator is the question mark (?). It can be written as.
**condition ? assignSomeValue : assignSomeOtherValue;**

In coding we can write,
**_System.out.println( 4 > 2 ? "4 is greater than 2" : "4 is not greater than 2");_**

It can be said that if the condition is true then do the first work otherwise do the second.
