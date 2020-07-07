# AndroidLifeCycle
This is a simple application to learn how the Activity and Fragment LifeCycle works

Scenario:
MainActivity -> FirstFragment ->(back, fragment closes) MainActivity -> (back, app closes)

2020-07-08 00:16:44.280 17770-17770/? D/State: Main Activity: On Create Method Called

2020-07-08 00:16:44.310 17770-17770/? D/State: First Fragment: On Attach Method Called

2020-07-08 00:16:44.327 17770-17770/? D/State: First Fragment: On Create Method Called

2020-07-08 00:16:44.345 17770-17770/? D/State: First Fragment: On Create View Method Called

2020-07-08 00:16:44.377 17770-17770/? D/State: First Fragment: On View Created Method Called

2020-07-08 00:16:44.394 17770-17770/? D/State: First Fragment: On Activity Created Method Called

2020-07-08 00:16:44.410 17770-17770/? D/State: Main Activity: On Start Method Called

2020-07-08 00:16:44.431 17770-17770/? D/State: Main Activity: On Resume Method Called

2020-07-08 00:16:44.441 17770-17770/? D/State: First Fragment: On Resume Method Called

2020-07-08 00:17:30.604 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: First Fragment: On Pause Method Called

2020-07-08 00:17:30.614 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: First Fragment: On Stop Method Called

2020-07-08 00:17:30.625 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: First Fragment: On Destroy View Method Called

2020-07-08 00:17:30.639 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: Main Activity: On Destroy Method Called

2020-07-08 00:17:30.648 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: First Fragment: On Detach Method Called

2020-07-08 00:17:59.738 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: Main Activity: On Pause Method Called

2020-07-08 00:18:00.417 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: Main Activity: On Stop Method Called

2020-07-08 00:18:00.428 17770-17770/com.example.adityasrivastava.androidlifecycleapp D/State: Main Activity: On Destroy Method Called
