(ns re-mdl.components.badge
  "Provides utility methods for creating badge components. More information on
  badges can be found [here](http://www.getmdl.io/components/index.html#badges-section).")

(defn badge
  "Adds a badge for small status descriptors for UI elements.
    ```[mdl/badge
      :badge-label \"♥\"
      :icon? true
      :child \"account_box\"]```"
  {:added "0.1.0"}
  [& {:keys [el id class attr
             badge-label no-background? overlap? icon?
             child]
      :or   {el :span}}]
  [el
   (merge
     (cond-> {:id    id
              :class (cond-> "mdl-badge"
                             class (str " " class)
                             no-background? (str " mdl-badge--no-background")
                             overlap? (str " mdl-badge--overlap")
                             icon? (str " material-icons"))}
             badge-label (assoc :data-badge badge-label))
     attr)
   child])
