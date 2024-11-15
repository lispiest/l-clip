### [Configure Local Storage](https://docs.datomic.com/datomic-local.html#storage-dir)
```bash
~ $ cd
~ $ mkdir -p ~/.datomic
~ $ echo "{:storage-dir "$PWD"}" > ~/.datomic/local.edn
~ $ mkdir -p ~/db
```
### PLAY (REPL)
```bash
$ clj -A:dev
```
```clj
user=> (start)
```
### -main
```bash
$ clojure -M:run
Starting up on port 3000
```
### URL
```
http://localhost:3000
```
