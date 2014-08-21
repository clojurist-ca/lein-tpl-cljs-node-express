# cljs-node+express

Use this [Leiningen](http://leiningen.org/) template to create a new
ClojureScript project that uses Node.js and Express.

## Usage

Generate a Node.js project with Express already added as a dependency:

```$ lein new cljs-node+express $NAME```

Fetch project dependencies (uses the excellent lein-npm plugin to fetch
dependencies using npm):

```$ lein deps```

Compile from ClojureScript to JavaScript (uses the equally excellent
lein-cljsbuild plugin to enable compilation):

```$ lein cljsbuild once```

Run the Express application using Node.js:

```$ node app.js```

## License

Copyright © 2014 Robert Medeiros

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
