for val in {1..99}
do
    if [ $(($val % 2)) == 1 ]; then
      echo $val
    fi
done
