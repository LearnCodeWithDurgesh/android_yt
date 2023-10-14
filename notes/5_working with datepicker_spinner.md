# Android Spinner / ListView

Spinner Provides a quick way to select one value from a set.

It is like a dropdown

Tapping on spinner display all values and user can select

## how to implement it

1. Add the spinner to layout

```xml
<Spinner
    android:id="@+id/names_spinner"
    android:layout_width="match_parent"
    android:layout_height="wrap_content" />
```

2. How to populate Spinner or ListView

- In order to put the values to this spnner we have to use ***Adapter*s**

- We use **ArrayAdapter** for values in array

- We use **CursorAdapter** for values in database

- We can create own adapter by extending **_BaseAdapter_**

```java
pinner spinner = (Spinner) findViewById(R.id.names_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout.
ArrayAdapter<String> adapter = ArrayAdapter.createFromResource(
        this,
        namesArray
        android.R.layout.simple_spinner_item
);
// Specify the layout to use when the list of choices appears.
adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner.
spinner.setAdapter(adapter);


```

## How to perform click listeners

Use **onItemSelected()** method to attach the listener.

```java

namesSpinner.setOnItemSelectedListener(
    (parent,view,pos,id)->{

    //item  clicked with pos
})

```
