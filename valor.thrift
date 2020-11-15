namespace java valor
namespace py valor

exception KeyNotFound {}

service Valor {
  string getItem(1:i32 key) throws (1:KeyNotFound knf),
  string setItem(1:i32 key, 2:string value) throws (1:KeyNotFound knf),
  void delItem(1:i32 key)
}
