read char
y='y'
Y='Y'

if [ $char = $y ] || [ $char = $Y ]; then
    echo 'YES'
else
    echo 'NO'
fi
