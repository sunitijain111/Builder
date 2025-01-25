## Builder

Hi all, in this project, we would try to build java builder. Let's Go!!!


### Product Requirement
Create annotation that when added to ta builder cen let you construct a class' instance by automatically using a builder.

If added @Builder annotation to a class:
1. I should be able to get a new object of that class without 'new' operator.
2. I should be able to get a new object by only using @Builder notation 
   Eg: Foo foo = Foo.Builder().build();
3. I should be able to initialise data members using builder.
   Eg: Foo foo = Foo.Builder().setBar1().setBar2().build();
4. I should be able to initialise data members with parameters using builder.
   Eg: Foo foo = Foo.Builder().setBar1(int a).setBar2().build();
5. I should be able to optionally choose to initialise only a few data members and let others be non initailise.
   Eg. Foo foo = Foo.Builder().setBar1(int a).build(); //bar2 has not been set.

#### Note
I have not incorporated final, static variable till now in version one.