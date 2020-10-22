[1] User shall be able to create different power profiles

-        To realize this requirement I created a class for User with an operation to Create a New Profile. I also created a Power Profile class, which has an association with the User.

[2] User shall be able to see a list of different apps that are consuming the battery

-        The System class aggregates the Applications class and has operations for listing apps. The System class has an association with the User class.

[3] User shall be able to order the apps in the list based on alphabetical order or power consumption level

-        The System class aggregates the Applications class with operations to sort by Alphabetic Name and Power Consumption. The User has an association to this class.

[4] User shall be able see / retrieve history of power consumption based on predefined period

-        The User class has an operation to retrieve history. The System class has an operation to compile the data. The Application class has an operation to save consumption data. System aggregates Application and User is associated to System.

[5] User shall be able to identify which app runs in the background

-        User class has an operation to identify applications. Application class is associated via the System class and has a naming attribute

[6] User shall be able click on the item details to get more details about any app in the list

-        The User class has an operation to provide detail. The System class has an operation to compile the data. The Application class has an operation to save consumption data. System aggregates Application and User is associated to System.

[7] User shall be able to close any app in the list from the application

-        User class has an operation to close applications

[8] User shall be able to see statistics of different apps and its power consumption graphically

-        The User class has an operation to display consumption graphically. The System class has an operation to compile the data. The Application class has an operation to save consumption data. System aggregates Application and User is associated to System.

[9] The system should trigger and alarm the users when battery level is below predefined level.

-        System class has an operation to trigger and alarm

[10] User shall be able to configure the triggers and alarms

-        User class has an operation to configure triggers and alarms
