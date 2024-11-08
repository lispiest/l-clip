### [Configure Local Storage](https://docs.datomic.com/datomic-local.html#storage-dir)
```bash
~ $ cd
~ $ mkdir -p ~/.datomic
~ $ echo $PWD > ~/.datomic/local.edn
~ $ mkdir -p ~/db
```
### PLAY
```bash
clj -A:dev
```
```clj
user=> (start)
```
### URL
```
http://localhost:3000
```
