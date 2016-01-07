# re-mdl

[![Clojars Project](http://clojars.org/com.yetanalytics/re-mdl/latest-version.svg)](http://clojars.org/com.yetanalytics/re-mdl)

## Overview

re-mdl gives you reusable components for use with Google's [Material Design Lite](http://www.getmdl.io/) 
in the style of [re-com](https://github.com/Day8/re-com). re-mdl is in active development, and is 
may not ready for use in production!!!

## Usage

```clojure
(require '[re-mdl.core :as mdl])

(defn button-component []
  [mdl/button
    :on-click #(js/alert "Clicked!")
    :ripple-effect? true
    :label "Ripple Button"])
```

Most MDL components can be created via the ```re-mdl.core``` namespace.
For better usage examples, please see *src-dev/re_mdl/demo/cljs*.

## Dev Setup

To get an interactive development environment run:

    lein figwheel

and open your browser at [localhost:3449](http://localhost:3449/).
This will auto compile and send all changes to the browser without the
need to reload. After the compilation process is complete, you will
get a Browser Connected REPL. An easy way to try it is:

    (js/alert "Am I connected?")

and you should see an alert in the browser window.

To clean all compiled files:

    lein clean

To create a production build run:

    lein cljsbuild once min

And open your browser in `resources/public/index.html`. You will not
get live reloading, nor a REPL.

## Tests

Using [phantomjs](http://phantomjs.org/):

    lein doo phantom test once

Thanks, [gadfly361](https://github.com/gadfly361)!

## Documentation

Using [codox](https://github.com/weavejester/codox)

    lein codox

## License

Copyright © 2015 Yet Analytics Inc

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
