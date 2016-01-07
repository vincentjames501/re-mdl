(ns re-mdl.components.button
  (:require [re-mdl.util :refer [wrap-mdl]]))

(defn button*
  [& {:keys [el label icon on-click
             disabled? raised? fab? mini-fab? colored? primary? accent? ripple-effect? for
             id class attr]
      :or   {el :button}
      :as   args}]
  [el
   (merge
    (cond-> {:on-click on-click
             :id id
             :class (cond-> "mdl-button mdl-js-button"
                      class (str (str " " class))
                      raised? (str " mdl-button--raised")
                      fab? (str " mdl-button--fab")
                      mini-fab? (str " mdl-button--fab mdl-button--mini-fab")
                      icon (str " mdl-button--icon")
                      colored? (str " mdl-button--colored")
                      primary? (str " mdl-button--primary")
                      accent? (str " mdl-button--accent")
                      ripple-effect? (str " mdl-js-ripple-effect"))}
      disabled? (assoc :disabled true)
      for (assoc :for for))
    attr)
   (if icon
     [:i.material-icons icon]
     label)])

(def button
  "Adds a variation of a Material Design button."
  (wrap-mdl button*))

(def flat-button
  "Adds a Material Design flat button"
  (wrap-mdl (partial button* :ripple-effect? true)))

(def raised-button
  "Adds a Material Design raised button"
  (wrap-mdl (partial button* :raised? true :ripple-effect? true)))

(def floating-action-button
  "Adds a Material Design floating action button"
  (wrap-mdl (partial button* :fab? true :ripple-effect? true)))
