# klib clj-new template

## Usage

### Full

```shell
clojure -Tclj-new create :template dev.kwill/klib :name test-lib/foo
```

### Reused

Add to `:aliases` in `~/.clojure/deps.edn`.

```clojure
:new-lib {:extra-deps {com.github.seancorfield/clj-new {:mvn/version "1.2.399"}}
          :exec-fn    clj-new/create
          :exec-args  {:template "dev.kwill/klib"}}
```

Use with:

```shell
clojure -X:new-lib :name myname/mylib
```

## Development

```shell
clojure -Tclj-new create :template '"/path/to/clj-template::klib"' \
  :name project-name :args '[arg1 arg2 arg3 ...]'
```

## License

Copyright © 2022 Kenny Williams

Distributed under the Eclipse Public License version 1.0.
