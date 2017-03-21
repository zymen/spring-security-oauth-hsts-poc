

```
polpc02992:oauth boguslaw.faja$ curl -v localhost:8081/test/ -H "X-Forwarded-Proto: https"
*   Trying ::1...
* Connected to localhost (::1) port 8081 (#0)
> GET /test/ HTTP/1.1
> Host: localhost:8081
> User-Agent: curl/7.43.0
> Accept: */*
> X-Forwarded-Proto: https
>
< HTTP/1.1 200 OK
< Expires: 0
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< X-XSS-Protection: 1; mode=block
< Pragma: no-cache
< X-Frame-Options: DENY
< Date: Tue, 21 Mar 2017 13:00:44 GMT
< Connection: keep-alive
< X-Content-Type-Options: nosniff
< Transfer-Encoding: chunked
< Content-Type: application/json;charset=UTF-8
< X-Application-Context: application:8081
<
* Connection #0 to host localhost left intact
{"a":"1"}polpc02992:oauth boguslaw.faja$
```

```
polpc02992:oauth boguslaw.faja$ curl  -v -d grant_type=password -d username=alfa -d password=xaaa -u e320781d-f923-497f-887b-58a5cdbf9b35:72d9cc02-9bf7-4688-8305-2c0c14c1e0fb -H "X-Forwarded-Proto: https" http://localhost:8081/oauth/token
*   Trying ::1...
* Connected to localhost (::1) port 8081 (#0)
* Server auth using Basic with user 'e320781d-f923-497f-887b-58a5cdbf9b35'
> POST /oauth/token HTTP/1.1
> Host: localhost:8081
> Authorization: Basic ZTMyMDc4MWQtZjkyMy00OTdmLTg4N2ItNThhNWNkYmY5YjM1OjcyZDljYzAyLTliZjctNDY4OC04MzA1LTJjMGMxNGMxZTBmYg==
> User-Agent: curl/7.43.0
> Accept: */*
> X-Forwarded-Proto: https
> Content-Length: 47
> Content-Type: application/x-www-form-urlencoded
>
* upload completely sent off: 47 out of 47 bytes
< HTTP/1.1 400 Bad Request
< Expires: 0
< Cache-Control: no-cache, no-store, max-age=0, must-revalidate
< X-XSS-Protection: 1; mode=block
< Pragma: no-cache
< X-Frame-Options: DENY
< Date: Tue, 21 Mar 2017 13:01:27 GMT
< Connection: keep-alive
< X-Content-Type-Options: nosniff
< Strict-Transport-Security: max-age=31536000 ; includeSubDomains
< Transfer-Encoding: chunked
< Content-Type: application/json;charset=UTF-8
< X-Application-Context: application:8081
<
* Connection #0 to host localhost left intact
{"error":"invalid_scope","error_description":"Empty scope (either the client or the user is not allowed the requested scopes)"}
```
