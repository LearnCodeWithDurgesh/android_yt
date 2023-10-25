## Recycler View ( Dynamic List using RecyclerView)

- Larget set of data can be easily and efficiently diplayed using R.V.

- We have to provide
  - Data
  - Look of item

### Why

- Increase the perforamce.
- Reduces Power consumption.
- When view goes off the screen RV reuse that view for new items.

### How to work with Recycler View

- Add `<RecyclerView>` to layout as normal elements.
- Each Element in R.V is created by `ViewHolder Object`. So we have to create `ViewHolder Object` and **bind** the data.

```java
    class CustomViewHolder extends RecyclerView.ViewHolder
    {


    }
```

- Adapter is need to request views and bind data by calling **_Adapter methods_**.

  Create Adapter Class

  ```java
  class RVAdapter extends RecyclerView.Adapter
  {


  }

  ```

- Layout Manager is reponsible to arrage the items in list.

### Lets the do example in App
