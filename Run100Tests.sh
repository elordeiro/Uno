# call mvn test 100 times
for i in {1..100}
do
   mvn test > /dev/null
   if [ $? -ne 0 ]; then
      echo "Error: mvn test failed"
      exit 1
   fi
   echo "mvn test $i passed"
done